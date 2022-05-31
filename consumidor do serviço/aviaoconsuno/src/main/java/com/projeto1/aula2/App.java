package com.projeto1.aula2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import java.util.Scanner;

import javax.xml.namespace.QName;

import com.projeto1.aula02.servico.AviaoSei;
import com.projeto1.aula02.servico.Avioes;

import jakarta.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8086/servico/aviao?wsdl");
		QName qname = new QName("http://servico.avioes.projeto1.com/", "AviaoSibService");
		Service service = Service.create(url, qname);
		AviaoSei aviao = service.getPort(AviaoSei.class);
		Scanner sc = new Scanner(System.in);
		int valor = 0;

		while (valor < 3) {

			System.out.println("bem vindo a listagem de aviões");
			System.out.println("1-adicionar um aviao");
			System.out.println("2-listar avioes");
			System.out.println("3-sair");
			valor = sc.nextInt();

			switch (valor) {
			case 1: {
				System.out.println("digite (em sequencia) o nome, a empresa e o modelo do seu avião");
				Avioes av = new Avioes();
				av.setNome(sc.next());
				av.setFabricante(sc.next());
				av.setModelo(sc.next());
				aviao.adicionar(av);
				System.out.println("aviao adicionado com sucesso");

				break;
			}
			case 2: {
				ArrayList<Avioes> aviao1 = new ArrayList<Avioes>();
				aviao1 = (ArrayList<Avioes>) aviao.listar();

				for (int i = 0; i < aviao1.size(); i++) {
					System.out.println("===================");
					System.out.println(aviao1.get(i).getId());
					System.out.println(aviao1.get(i).getNome());
					System.out.println(aviao1.get(i).getFabricante());
					System.out.println(aviao1.get(i).getModelo());
					System.out.println("*===================*");

				}
				break;
			}
			case 3: {
				System.out.println(" até a proxima");
				valor = 3;
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + valor);
			}

		}

//		String dianascimento = certidao.diaSemanaNascimento("30/07/1963");
//		int idade = certidao.calculaidade("13/07/1995");
//		double calorias = certidao.caloriasgastas(26, 64d, 178d);

//		System.out.println("o dia de semana que voce nasceu foi: " + dianascimento + " ,sua idade: " + idade
//				+ " ,quantidade de calorias gastas diariamente: " + calorias);
	}
}
