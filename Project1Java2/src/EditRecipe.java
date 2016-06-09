import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;


public class EditRecipe {
	private String id_recipe;
	@SuppressWarnings("unused")
	private String name_recipe,mash_1,mash_2,mash_3;
	private Vector<Recipe> recipeVector = new Vector<Recipe>();
	
	public EditRecipe() {
		this.AddRecipe();
	}
	
	public void AddRecipe(){
		try {
			Scanner reIn = new Scanner(new File("recipe.txt"));
			while (reIn.hasNext()) {
				Recipe re = new Recipe(reIn.next(), reIn.next(), reIn.next(),
						reIn.next(), reIn.next());
				recipeVector.add(re);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
	}
	
	
	// ** บรรทึกข้อมูล ลงในไฟล์ recipe.txt **
			public void writeRecipe() {
				try {
					BufferedWriter out1 = new BufferedWriter(new FileWriter(
							"recipe.txt"));
					for (Recipe re : recipeVector) {
						out1.write(re.toString());
						out1.newLine();
					}
					out1.close();
				} catch (IOException e) {
					System.out.println("Input / Output Stream Error!!");
				}
			}
	
	
	public int findid_recipe(String recipe){
		for (int i = 0; i < recipeVector.size(); i++) {
			if(recipe.equalsIgnoreCase(recipeVector.get(i).getName_recipe())){
				return i;
			}
		}
		return -1;
	}
	
	// ** แก้ไขข้อมูล วิชาในไฟล์ recipe.txt **
	public boolean editRecipe() {
		int tmp = -1;
		String recipe_name = "";
		String recipe_mash_1 = "";
		String recipe_mash_2 = "";
		String recipe_mash_3 = "";
		
		ShowRecipe sh = new ShowRecipe();
		
		try {
			sh.listRecipe();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-- แก้ไขส่วนผสมกาแฟ --");
		System.out.println("  ");
		Scanner edit_recipe = new Scanner(System.in);
		System.out.println("กรุณากรอกชื่อกาแฟที่ต้องการแก้ไขส่วนผสม : ");
		
		recipe_name = edit_recipe.nextLine();
		

		tmp = findid_recipe(recipe_name);	
		
		System.out.println("กรุณากรอกจำนวนส่วนผสมที่ 1 : ");
		recipe_mash_1 = edit_recipe.nextLine();
		
		
		if (!recipe_mash_1.equalsIgnoreCase(" ")) {
			recipeVector.get(tmp).setMash_1(recipe_mash_1);
		}
		System.out.println("กรุณากรอกจำนวนส่วนผสมที่ 2 : ");
		recipe_mash_2 = edit_recipe.nextLine();
		
		
		if (!recipe_mash_2.equalsIgnoreCase(" ")) {
			recipeVector.get(tmp).setMash_2(recipe_mash_2);
		}
		
		
		System.out.println("กรุณากรอกจำนวนส่วนผสมที่ 3 : ");
		recipe_mash_3 = edit_recipe.nextLine();
		
		
		
		if (!recipe_mash_3.equalsIgnoreCase(" ")) {
			recipeVector.get(tmp).setMash_3(recipe_mash_3);
		}
		writeRecipe();
		System.out.println("การแก้ไขส่วนผสมกาแฟเสร็จสมบูรณ์");
		return false;
	}

}
