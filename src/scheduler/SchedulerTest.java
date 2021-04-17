package scheduler;

import java.io.IOException;
// 문자를 입력받는 System.in.read()를 사용하려면 IOException 에서 오류를 처리해야 한다.

public class SchedulerTest {
	public static void main(String[] args) throws IOException{
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례대로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당");
		System.out.println("A: 상담원이 전화를 가져가기");
		
		int ch = System.in.read();//할당방식을 입력받아 ch 변수에 대입
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		//doesn't matter what policy you choose
	}
}
