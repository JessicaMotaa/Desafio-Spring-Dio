package one.DigitalInovation.got;

public class Teste {

	private void PublicMain() {
		
		//Singleton 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		ComportamentoStrategy defensivo = new ComportamentoDefensivo();
		ComportamentoStrategy normal = new ComportamentoNormal();
		ComportamentoStrategy agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
	}
}

