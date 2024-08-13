package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String,String> pokedex = new HashMap<String, String>();
        do{
            try {
               String nome, tipo;
               do {
                   nome = JOptionPane.showInputDialog(null,"Digite o nome do Pokémon ou \"fim\" para finalizar: ");
                   if (!nome.equalsIgnoreCase("FIM")) {
                       if (pokedex.containsKey(nome)) {
                           JOptionPane.showMessageDialog(null, "Pokémon já cadastrado");
                       }else{
                           tipo = JOptionPane.showInputDialog(null, "Digite o tipo do pokémon: ").toUpperCase();
                           pokedex.put(nome, tipo);
                       }
                   }
               }while (!nome.equalsIgnoreCase("FIM"));
               String escolha = JOptionPane.showInputDialog(null,"Escolha o tipo de pokemon para pesquisar: ").toUpperCase();

               if (pokedex.containsValue(escolha)){
                   List<String> pokemons = new ArrayList<String>();
                for (Map.Entry<String,String> valor : pokedex.entrySet()){
                    System.out.println("Chave: " + valor.getKey() + "\tValor: " + valor.getValue());
                    if (valor.getValue().equals(escolha)){
                        pokemons.add(valor.getKey());
                    }
                }

                JOptionPane.showMessageDialog(null,"Pokémons do mesmo tipo: " + pokemons);

               }else {
                   JOptionPane.showMessageDialog(null,"Tipo não cadastrado");
               }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }while (JOptionPane.showConfirmDialog(null,"Deseja Continuar? ",
                "Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null,"Fim de Programa!");
    }
}
