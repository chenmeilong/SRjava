public class Homework09 { 

	//��дһ��main����
	public static void main(String[] args) {
		Music music = new Music("Ц������", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}
/*
��Music�࣬������������name������ʱ��times���ԣ�
���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
 */
class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//����play����
	public void play() {
		System.out.println("���� " + name + " ���ڲ�����.... ʱ��Ϊ" + times + "��");
	}
	//���ر���������Ϣ�Ĺ��ܷ���getInfo
	public String getInfo() {
		return "���� " + name + " ����ʱ��Ϊ" + times;
	}

}