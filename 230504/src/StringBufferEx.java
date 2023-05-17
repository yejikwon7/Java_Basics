public class StringBufferEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); // 문자열 덧붙이기, 띄어쓰기까지 포함
		System.out.println(sb);
		
		sb.insert(7, " my"); // " my" 문자열 삽입, index 7에 삽입 시작
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // "your" 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정, 이외 초과 데이터 손실
		System.out.println(sb);
	}

}
