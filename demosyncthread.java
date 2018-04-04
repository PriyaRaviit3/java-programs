
	class callme
		{
			synchronized public void call(String s1)
				{
					System.out.println("["+s1);

					try{
					Thread.sleep(2000);
					}catch(InterruptedException d){}

					System.out.println("]");
				}
		
		}

	class caller extends Thread
		{
				callme target;
				Thread t;
				String s2;
			
			caller(callme target,String s2)
				{

						this.s2=s2;
						this.target=target;
						 t=new Thread(this);

					t.start();
				}
		
			public void run()
				{
					target.call(s2);
				}		

		}
	class demosyncthread
		{
			public static void main(String args[])
				{
					callme target=new callme();
					caller obj1=new caller(target,"J");				
					caller obj2=new caller(target,"A");
					caller obj3=new caller(target,"v");
					caller obj4=new caller(target,"A");				

				}


		}
