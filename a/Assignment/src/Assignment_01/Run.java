package Assignment_01;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company("DenChai Trading CO.,LTD","11/2 Rattanakosin Rd.,muang ChiangMai Thailand 50200");
		Company com1 = new Company("�Ң��Ԫ�෤��������ʹ�� ����Է����ʵ��","����Է���������� �.˹ͧ��� �.�ѹ���� �.��§����");

		Authorized aut = new Authorized("����ԪԵ","���ѧ���","Senier Program");
		HeadDepartment head = new HeadDepartment("�Ԫ���","�¾����","Technic");
		Neqotiator neq = new Neqotiator("ó���","���ѧ","08-2764-4990");
		
		Product pro1 = new Product(2500.00,"1","����֡ SAMSUNG SCX-63220DN");
		Product pro2 = new Product(2500.00,"2","SAMSUNG SCX-63220DN");
		
		
		Orderline odl1 = new Orderline();
		odl1.addProduct(2, pro1);
		
		Orderline odl2 = new Orderline();
		odl2.addProduct(3, pro2);
		
		Order od = new Order("03/12/2555","QS006/550002","200 Ἱ�����ͧ���");
		od.addOrderline(odl1);
		od.addOrderline(odl2);
		
		//Display
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		System.out.println("Denchai\t|\t\t\t\t\t\t|\t��ʹ��Ҥ�\t\t|");
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
		
		
		
		System.out.println("�ӴѺ���\t\t��¡��\t\t\t\t�Ҥ�/˹���\t\t�ӹǹ\t�Ҥ����");
		od.orderList();
		
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		System.out.print("�����˵صԴ��ͤس *"+neq.getName()+"   "+neq.getNqt_phone()+"\n"+"\t�Ҥҷ���ʹ����������Ť����������");
		
		System.out.println("\t\t\t\t�����Ť��\t\t"+od.calNetTotal());
		System.out.println("\t\t\t\t\t\t\t������Ť������\t\t"+od.calVat());
		System.out.println("\t\t\t\t\t\t\t�ӹǹ�Թ������\t"+od.calSum());
		
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		
		System.out.println("��˹��ѹ���ͺ ...... �ѹ �Ѻ�ҡ�ѹ������Ѻ���觫����Թ���\t\t\t|\t͹��ѵ���觫��͵����ʹ��ҤҢ�ҧ��");
		System.out.println("�׹�Ҥ�\t ...... �ѹ �Ѻ�ҡ�ѹ����ʹ��Ҥ�\t\t\t\t|\tŧ���� .............. �����觫���");
		System.out.println("����ѷ��ѧ�����ҧ�����Ҩ����Ѻ��þԨ�ó���觫��ͨҡ��ҹ\t\t\t\t|\t�ѹ�����觫��� ...../.../.....");
		System.out.println("  �͢ͺ��ؤس�����ҧ�٧�� � �͡�ȹ�����");
		System.out.println("----------------------------------------" +
				"----------------------------------------");
		
		System.out.println("\t���͹��ѵ�\t\t\t���˹���\t\t\t����ʹ��Ҥ�");
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
