package com.study.shz.delegate;

public class Boss implements DoJob{
	
	private DoJob dojob;
	public  Boss(DoJob dojob) {
		this.dojob = dojob;
	}
	//项目经理，虽然也有执行方法
		//但是他的工作职责是不一样的
	@Override
	public void doJob() {
		dojob.doJob();
		
	}

}
