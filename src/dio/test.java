package dio;

import dio.Strategy.Comportamento;
import dio.Strategy.ComportamentoAgressivo;
import dio.Strategy.ComportamentoDefensivo;
import dio.Strategy.ComportamentoNormal;
import dio.Strategy.Robo;
import dio.facade.Facade;
import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;

public class test {

    public static void main(String[] args){

        //Testes relacionados ao Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    
        //Testes relacionados ao Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();

        //Testes relacionados ao Facede
        Facade facade = new Facade();
        facade.migrarCliente("Guilherme", "9999999");
    }
}
