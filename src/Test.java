public class Test {
	
public static void main(String[] args) {
	 new Test().dothis1(29700f,0.07f,0.1475f,11);
}
//float a=12000f ;   //本金
//float b = 0.1f;    //贴息费率
//float irr = 0.1991f;  //irr
//int i = 12;  //期数
int[] monthsday = {31,29,31,30,31,30,31,31,30,31,30,31};
public  float dothis(float a,float b,float irr,int i){
	float c = 0;    //已还本金
	float t= a-a*b; //摊余成本
	float value =0; // 每期摊销
	float totalValue = 0; //总摊销
	for(int j=1;j<=i;j++){
		value =  t * irr/12; //上期摊余成本*IRR/12
		c = c+(a/i-value);  //计算已还本金
		t = a-a*b-c;         //计算本期摊余成本
		totalValue+=value;
		System.out.println("第"+j+"期:"+value+" 摊销："+value/monthsday[j-1]);
	}
	System.out.println("总计："+totalValue);
	return value;
	}
public  float dothis1(float a,float b,float irr,int i){
	float c = 0;    //已还本金
	float t= a-a*b; //摊余成本
	float value =0; // 每期摊销
	float totalValue = 0; //总摊销
	for(int j=1;j<=i;j++){
		value = t * irr/12;
		c = c+(a/i-value);  //计算已还本金
		t = a-a*b-c;         //计算本期摊余成本
		totalValue+=value;
		System.out.println("第"+j+"期:"+value+" 摊销："+value/monthsday[j-1]);
	}
	System.out.println("总计："+totalValue);
	return value;
	}
}
