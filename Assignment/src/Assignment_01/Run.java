package Assignment_01;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company("DenChai Trading CO.,LTD","11/2 Rattanakosin Rd.,muang ChiangMai Thailand 50200");
		Company com1 = new Company("สาขาวิชาเทคโนโลยีสารสนเทศ คณะวิทยาศาสตร์","มหาวิทยาลัยแม่โจ้ ต.หนองหาร อ.สันทราย จ.เชียงใหม่");

		Authorized aut = new Authorized("นายวิชิต","นครังกุล","Senier Program");
		HeadDepartment head = new HeadDepartment("ณิชาภา","ไชยพรมมา","Technic");
		Neqotiator neq = new Neqotiator("รณชัย","อิมัง","08-2764-4990");
		
		Product pro1 = new Product(2500.00,"1","ผงหมึก SAMSUNG SCX-63220DN");
		Product pro2 = new Product(2500.00,"2","SAMSUNG SCX-63220DN");
		
		
		Orderline odl1 = new Orderline();
		odl1.addProduct(2, pro1);
		
		Orderline odl2 = new Orderline();
		odl2.addProduct(3, pro2);
		
		Order od = new Order("03/12/2555","QS006/550002","200 แผนกเครื่องเช่า");
		od.addOrderline(odl1);
		od.addOrderline(odl2);
		
		//Display
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		System.out.println("Denchai\t|\t\t\t\t\t\t|\tใบเสนอราคา\t\t|");
		System.out.println("----------------------------------------" +
							"----------------------------------------|");
		System.out.println(com1.getComName()+"\t\t\t\t|\t\t\t|\n"+com1.getComAdd()+"\t\t\t\t|\t\t\t|");
		System.out.println(od);
		System.out.println("----------------------------------------" +
							"----------------------------------------|");
		//Orderline
		odl1.calSum();
		odl1.calVat();
		odl1.calTotal();
		odl1.calNetTotal();
		odl2.calSum();
		odl2.calVat();
		odl2.calTotal();
		odl2.calNetTotal();
		
		
		
		System.out.println("ลำดับที่\t\tรายการ\t\t\t\tราคา/หน่วย\t\tจำนวน\tราคารวม");
		od.orderList();
		
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		System.out.print("หมายเหตุติดต่อคุณ *"+neq.getName()+"   "+neq.getNqt_phone()+"\n"+"\tราคาที่เสนอรวมภาษีมูลค่าเพิ่มแล้ว");
		
		System.out.println("\t\t\t\tรวมมูลค่า\t\t"+od.calNetTotal());
		System.out.println("\t\t\t\t\t\t\tภาษีมูลค่าเพิ่ม\t\t"+od.calVat());
		System.out.println("\t\t\t\t\t\t\tจำนวนเงินทั้งสิ้น\t"+od.calSum());
		
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		
		System.out.println("กำหนดวันส่งมอบ ...... วัน นับจากวันที่ได้รับใบสั่งซื้อสินค้า\t\t\t|\tอนุมัติสั่งซื้อตามใบเสนอราคาข้างต้น");
		System.out.println("ยืนราคา\t ...... วัน นับจากวันที่เสนอราคา\t\t\t\t|\tลงชื่อ .............. ผู้สั่งซื้อ");
		System.out.println("บริษัทหวังเป็นอย่างบิ่งว่าจะได้รับการพิจารณาสั่งซื้อจากท่าน\t\t\t\t|\tวันที่สั่งซื้อ ...../.../.....");
		System.out.println("  ขอขอบพรุคุณเป็นอย่างสูงมา ณ โอกาศนี้ด้วย");
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		
		System.out.println("\tผู้อนุมัตื\t\t\tหัวหน้าแน\t\t\tผู้เสนอราคา");
		System.out.println("\n  .................\t   .................\t   .................");
		System.out.println("     "+aut+"\t      "+head+"\t        "+neq);
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		System.out.println(com.getComName()+"\n"+com.getComAdd());
		//Person
//		System.out.println(aut);
//		System.out.println(head);
//		System.out.println(neq);
//		System.out.println(ors);
	}

}
