
public class Switch01 {

	public static void main(String[] args) {
		// 1-> �عٶ��
		// 2-> �ڽ���
		// 3-> ���
		
		int inData = 1;
		String flowerName = "";
		
		switch(inData) {
		case 1:
			flowerName = "�عٶ��";
			break;
		case 2:
			flowerName = "�ڽ���";
			break;
		case 3:
			flowerName = "���";
			break;
		default :
			flowerName = "���� ��";
		}
		
		System.out.printf("%d�� %s�Դϴ�.\n", inData, flowerName);
	}

}

/*
	 byte, short, int, char, String
	 
	 switch(���� or ��� or ����) {
	 	
	 	case ��� : 
	 		
	 		���๮;
	 		���๮;
	 		break;	->��������
	 		
		case ��� :
		
			���๮;
			
		default:	->��������
			���๮;
	 }

*/