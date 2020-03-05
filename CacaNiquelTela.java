package Caca_niquel_em_java;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
public class CacaNiquelTela extends JFrame
{
    JLabel LabelTitulo, LabelApostaDoUsuario, NumeroApostado, ResultadoApostado, LabelResultado, LabelResultadoAposta;
    JLabel LabelApostaValor, LabelValorAposta, LabelValorAposta1, LabelTituloImagem, LabelAposta1, LabelAposta2, LabelAposta3;
    JLabel LabelEstatisticaTitulo, LabelVitoriasDoJogador, LabelCombinacoesEspeciais, LabelCombinacoesTriplas, LabelCombinacoesDuplas,LabelPartidasJogadas;
    JButton Aposta, Inicio, ButtonResultadoAposta,LimparPlacar, Sobre, Limpar, Ajuda, Lista, Sair;
    JTextField NumeroResultadoTela;
    JPanel PanelProgama, TelaResultadoAposta,TelaPremioDaAposta, PanelTela, PanelTitulo, PanelPainel, PanelValorAposta, PanelApostas, PanelApostasLista, PanelEstatisticas;
    ButtonHandler handler = new ButtonHandler();
    String VitoriasDoJogador, ValorAposta, CombinacoesEspeciais, CombinacoesTriplas, CombinacoesDuplas, PartidasJogadas;
    
    public static void main(String args[])
    {
        new CacaNiquelTela();
    }
    
    public CacaNiquelTela()
    {
        super("Caça Niquel");
        Container Tela = getContentPane();
        Tela.setLayout(new BorderLayout());
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel do fundo do programa**/
        PanelProgama = new JPanel();                                            
        PanelProgama.setBounds(0,0,700,500);                    
        PanelProgama.setLayout(null);                           
        PanelProgama.setBorder(BorderFactory.createTitledBorder("")); 
        PanelProgama.setBackground(Color.DARK_GRAY);
        Tela.add(BorderLayout.CENTER, PanelProgama);
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel da tela do programa**/
        PanelTela = new JPanel();                                               
        PanelTela.setBounds(0,0,650,500);                       
        PanelTela.setLayout(null);                              
        PanelTela.setBorder(BorderFactory.createTitledBorder(""));                          
        PanelTela.setBackground(Color.GRAY);                                    
        PanelProgama.add(PanelTela);
        
        //--------------------------------------
        
        NumeroApostado = new JLabel("Valor apostado:");                         
        NumeroApostado.setBounds(50,270,150,30);                
        PanelTela.add(NumeroApostado);                          
        NumeroApostado.setFont(new Font("Times New Roman",Font.BOLD,20));                   
        NumeroApostado.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        
        ResultadoApostado = new JLabel(" " + "********");                       
        ResultadoApostado.setBounds(200,270,300,30);            
        PanelTela.add(ResultadoApostado);                       
        ResultadoApostado.setFont(new Font("Times New Roman",Font.BOLD,20));                
        ResultadoApostado.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        
        LabelResultado = new JLabel("Premio da Aposta:");                       
        LabelResultado.setBounds(50,330,450,30);                
        PanelTela.add(LabelResultado);                          
        LabelResultado.setFont(new Font("Times New Roman",Font.BOLD,20));                   
        LabelResultado.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        
        LabelApostaValor = new JLabel("Total de moedas:");                      
        LabelApostaValor.setBounds(50,300,150,30);              
        PanelTela.add(LabelApostaValor);                        
        LabelApostaValor.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelApostaValor.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        
        ValorAposta = " " + "*****" + " ";
        
        LabelValorAposta = new JLabel(ValorAposta);                             
        LabelValorAposta.setBounds(200,300,200,30);             
        PanelTela.add(LabelValorAposta);                        
        LabelValorAposta.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelValorAposta.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        
        LabelValorAposta1 = new JLabel("  " + "Moeda(s)");                      
        LabelValorAposta1.setBounds(400,300,100,30);
        PanelTela.add(LabelValorAposta1);                       
        LabelValorAposta1.setFont(new Font("Times New Roman",Font.BOLD,20));                
        LabelValorAposta1.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel onde fica o titulo**/
        PanelTitulo = new JPanel();                                             
        PanelTitulo.setBounds(50,10,550,100);                   
        PanelTitulo.setLayout(null);                            
        PanelTitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));                        
        PanelTitulo.setBackground(Color.GRAY);                            
        PanelTela.add(PanelTitulo);
        
        //--------------------------------------
        
        LabelTitulo = new JLabel("Caça Niquel",SwingConstants.CENTER);          
        LabelTitulo.setBounds(60,20,420,60);                    
        PanelTitulo.add(LabelTitulo);                           
        LabelTitulo.setFont(new Font("Times New Roman",Font.BOLD,50));                      
        LabelTitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        LabelTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        LabelTituloImagem = new JLabel();
        ImageIcon NumeroImagem18 = new ImageIcon("TituloTela3.PNG");          
        NumeroImagem18.setImage(NumeroImagem18.getImage().getScaledInstance(550,100,165));     
        LabelTituloImagem.setIcon(NumeroImagem18);
        
        //--------------------------------------
        
        LabelTituloImagem = new JLabel(NumeroImagem18);          
        LabelTituloImagem.setBounds(0,0,550,100);                    
        PanelTitulo.add(LabelTituloImagem);
        LabelTituloImagem.setBorder(BorderFactory.createTitledBorder(""));
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel onde é localizado os botoes**/
        PanelPainel = new JPanel();                                             
        PanelPainel.setBounds(652,0,240,270);                   
        PanelPainel.setLayout(null);                            
        PanelPainel.setBorder(BorderFactory.createSoftBevelBorder(SoftBevelBorder.RAISED));                        
        PanelPainel.setBackground(Color.LIGHT_GRAY);                            
        PanelProgama.add(PanelPainel);
        
        //--------------------------------------
        
        Inicio = new JButton();
        ImageIcon NumeroImagem9 = new ImageIcon("BotaoInicio.PNG");          
        NumeroImagem9.setImage(NumeroImagem9.getImage().getScaledInstance(220,250,165));     
        Inicio.setIcon(NumeroImagem9);
        
        //--------------------------------------
        
        Inicio = new JButton(NumeroImagem9);                                         
        Inicio.setBounds(10,10, 220,250);                       
        PanelPainel.add(Inicio);                                
        Inicio.addActionListener(handler);
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel onde é digitado a aposta**/
        PanelValorAposta = new JPanel();                                        
        PanelValorAposta.setBounds(660,275,220,190);            
        PanelValorAposta.setLayout(null);                       
        PanelValorAposta.setBorder(BorderFactory.createSoftBevelBorder(SoftBevelBorder.RAISED));                   
        PanelValorAposta.setBackground(Color.LIGHT_GRAY);                       
        PanelProgama.add(PanelValorAposta);
        
        //--------------------------------------
        
        LabelApostaDoUsuario = new JLabel("Valor da aposta:",SwingConstants.CENTER);                  
        LabelApostaDoUsuario.setBounds(10,10,200,50);           
        PanelValorAposta.add(LabelApostaDoUsuario);             
        LabelApostaDoUsuario.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        //--------------------------------------
        
        NumeroResultadoTela = new JTextField("");                               
        NumeroResultadoTela.setBounds(10,50,200,30);            
        PanelValorAposta.add(NumeroResultadoTela);              
        NumeroResultadoTela.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        //--------------------------------------
        
        Ajuda = new JButton("Ajuda");                                           
        Ajuda.setBounds(10,90,100,30);                          
        PanelValorAposta.add(Ajuda);                            
        Ajuda.addActionListener(handler);
        
        //--------------------------------------
        
        Aposta = new JButton("Aposta");                                         
        Aposta.setBounds(110,90,100,30);                        
        PanelValorAposta.add(Aposta);                           
        Aposta.addActionListener(handler);
        
        //--------------------------------------
        
        Sobre = new JButton("Sobre");                                           
        Sobre.setBounds(10,120,100,30);                         
        PanelValorAposta.add(Sobre);                            
        Sobre.addActionListener(handler);
        
        //--------------------------------------
        
        Limpar = new JButton("Limpar");                                         
        Limpar.setBounds(110,120,100,30);                       
        PanelValorAposta.add(Limpar);                           
        Limpar.addActionListener(handler);
        
        //--------------------------------------
        
        Lista = new JButton("Lista");                                           
        Lista.setBounds(10,150,100,30);                         
        PanelValorAposta.add(Lista);                            
        Lista.addActionListener(handler);
        
        //--------------------------------------
        
        Sair = new JButton("Sair");                                             
        Sair.setBounds(110,150,100,30);                         
        PanelValorAposta.add(Sair);                             
        Sair.addActionListener(handler);
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel onde o resultado da aposta é exibido**/
        TelaResultadoAposta = new JPanel();                                     
        TelaResultadoAposta.setBounds(50,360,450,100);          
        TelaResultadoAposta.setLayout(null);                    
        TelaResultadoAposta.setBorder(BorderFactory.createSoftBevelBorder(SoftBevelBorder.RAISED));                
        TelaResultadoAposta.setBackground(Color.LIGHT_GRAY);                    
        PanelTela.add(TelaResultadoAposta);
        
        //--------------------------------------
        
        TelaPremioDaAposta = new JPanel();                                     
        TelaPremioDaAposta.setBounds(125,25,200,50);          
        TelaPremioDaAposta.setLayout(null);                    
        TelaPremioDaAposta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));                
        TelaPremioDaAposta.setBackground(Color.LIGHT_GRAY);                    
        TelaResultadoAposta.add(TelaPremioDaAposta);
        
        //--------------------------------------
        
        LabelResultadoAposta = new JLabel("*******",SwingConstants.CENTER);     
        LabelResultadoAposta.setBounds(125,5,200,20);
        TelaResultadoAposta.add(LabelResultadoAposta);
        LabelResultadoAposta.setBorder(BorderFactory.createEtchedBorder());   
        LabelResultadoAposta.setFont(new Font("Times New Roman",Font.BOLD,20)); 
        LabelResultadoAposta.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        ButtonResultadoAposta = new JButton("Resultado");                                          
        ButtonResultadoAposta.setBounds(10,10,180,30);                         
        TelaPremioDaAposta.add(ButtonResultadoAposta);                            
        ButtonResultadoAposta.addActionListener(handler);
        ButtonResultadoAposta.setVisible(false);
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel de apostas**/
        PanelApostas = new JPanel();                                            
        PanelApostas.setBounds(50,120,450,150);                 
        PanelApostas.setLayout(null);                           
        PanelApostas.setBorder(BorderFactory.createTitledBorder(""));                       
        PanelApostas.setBackground(Color.LIGHT_GRAY);                           
        PanelTela.add(PanelApostas);
        
        //--------------------------------------
        
        LabelAposta1 = new JLabel();
        ImageIcon NumeroImagem4 = new ImageIcon("N.PNG");          
        NumeroImagem4.setImage(NumeroImagem4.getImage().getScaledInstance(120,120,165));     
        LabelAposta1.setIcon(NumeroImagem4);
        LabelAposta1 = new JLabel(NumeroImagem4);
        
        //--------------------------------------
        
        LabelAposta1.setBounds(35,15,120,120);                  
        PanelApostas.add(LabelAposta1);                         
        LabelAposta1.setFont(new Font("Times New Roman",Font.BOLD,60));                     
        LabelAposta1.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.DARK_GRAY,5), new LineBorder(Color.LIGHT_GRAY,5)));           
        LabelAposta1.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        LabelAposta2 = new JLabel(); 
        ImageIcon NumeroImagem5 = new ImageIcon("N.PNG");          
        NumeroImagem5.setImage(NumeroImagem5.getImage().getScaledInstance(120,120,165));     
        LabelAposta2.setIcon(NumeroImagem5);
        
        //--------------------------------------
        
        LabelAposta2 = new JLabel(NumeroImagem5);                   
        LabelAposta2.setBounds(165,15,120,120);                 
        PanelApostas.add(LabelAposta2);                         
        LabelAposta2.setFont(new Font("Times New Roman",Font.BOLD,60));                     
        LabelAposta2.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.DARK_GRAY,5), new LineBorder(Color.LIGHT_GRAY,5)));           
        LabelAposta2.setHorizontalTextPosition(SwingConstants.CENTER); 
        
        //--------------------------------------
        
        LabelAposta3 = new JLabel();  
        ImageIcon NumeroImagem6 = new ImageIcon("N.PNG");          
        NumeroImagem6.setImage(NumeroImagem6.getImage().getScaledInstance(120,120,165));     
        LabelAposta3.setIcon(NumeroImagem6);
        
        //--------------------------------------
        
        LabelAposta3 = new JLabel(NumeroImagem6);                   
        LabelAposta3.setBounds(295,15,120,120);                 
        PanelApostas.add(LabelAposta3);                         
        LabelAposta3.setFont(new Font("Times New Roman",Font.BOLD,60));                     
        LabelAposta3.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.DARK_GRAY,5), new LineBorder(Color.LIGHT_GRAY,5))); 
        LabelAposta3.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        //--------------------------------------//--------------------------------------
        
        /**Panel das estatisticas do usuario**/
        PanelEstatisticas = new JPanel();
        PanelEstatisticas.setBounds(505,120,95,340);                 
        PanelEstatisticas.setLayout(null);                           
        PanelEstatisticas.setBorder(BorderFactory.createTitledBorder(""));                       
        PanelEstatisticas.setBackground(Color.LIGHT_GRAY);                           
        PanelTela.add(PanelEstatisticas);
        
        //--------------------------------------
        
        LabelEstatisticaTitulo = new JLabel("Placar",SwingConstants.CENTER);
        LabelEstatisticaTitulo.setBounds(5,5,85,20);                 
        PanelEstatisticas.add(LabelEstatisticaTitulo);                         
        LabelEstatisticaTitulo.setFont(new Font("Times New Roman",Font.BOLD,20));                     
        LabelEstatisticaTitulo.setBorder(BorderFactory.createEtchedBorder());           
        LabelEstatisticaTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        VitoriasDoJogador = "<html>" + "Vitorias:" + "<br>" + "***" + "<br>" + "</html>";
        
        LabelVitoriasDoJogador = new JLabel(VitoriasDoJogador,SwingConstants.CENTER); 
        LabelVitoriasDoJogador.setBounds(5,45,85,40);                 
        PanelEstatisticas.add(LabelVitoriasDoJogador);                         
        LabelVitoriasDoJogador.setFont(new Font("Times New Roman",Font.BOLD,15));                     
        LabelVitoriasDoJogador.setBorder(BorderFactory.createEtchedBorder());           
        LabelVitoriasDoJogador.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        CombinacoesEspeciais = "<html>" + "Especiais:" + "<br>" + "***" + "<br>" + "</html>";
        
        LabelCombinacoesEspeciais = new JLabel(CombinacoesEspeciais,SwingConstants.CENTER);
        LabelCombinacoesEspeciais.setBounds(5,95,85,40);
        PanelEstatisticas.add(LabelCombinacoesEspeciais);                         
        LabelCombinacoesEspeciais.setFont(new Font("Times New Roman",Font.BOLD,15));                     
        LabelCombinacoesEspeciais.setBorder(BorderFactory.createEtchedBorder());           
        LabelCombinacoesEspeciais.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        CombinacoesTriplas = "<html>" + " Triplas:" + "<br>" + "***" + "<br>" + "</html>";
        
        LabelCombinacoesTriplas = new JLabel(CombinacoesTriplas,SwingConstants.CENTER);
        LabelCombinacoesTriplas.setBounds(5,145,85,40);                 
        PanelEstatisticas.add(LabelCombinacoesTriplas);                         
        LabelCombinacoesTriplas.setFont(new Font("Times New Roman",Font.BOLD,15));                     
        LabelCombinacoesTriplas.setBorder(BorderFactory.createEtchedBorder());           
        LabelCombinacoesTriplas.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        CombinacoesDuplas = "<html>" + " Duplas:" + "<br>" + "***" + "<br>" + "</html>";
        
        LabelCombinacoesDuplas = new JLabel(CombinacoesDuplas,SwingConstants.CENTER); 
        LabelCombinacoesDuplas.setBounds(5,195,85,40);                 
        PanelEstatisticas.add(LabelCombinacoesDuplas);                         
        LabelCombinacoesDuplas.setFont(new Font("Times New Roman",Font.BOLD,15));                     
        LabelCombinacoesDuplas.setBorder(BorderFactory.createEtchedBorder());           
        LabelCombinacoesDuplas.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        PartidasJogadas = "<html>" + " Jogadas:" + "<br>" + "***" + "<br>" + "</html>";
        
        LabelPartidasJogadas = new JLabel(PartidasJogadas,SwingConstants.CENTER);
        LabelPartidasJogadas.setBounds(5,245,85,40);
        PanelEstatisticas.add(LabelPartidasJogadas);                         
        LabelPartidasJogadas.setFont(new Font("Times New Roman",Font.BOLD,15));                     
        LabelPartidasJogadas.setBorder(BorderFactory.createEtchedBorder());           
        LabelPartidasJogadas.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //--------------------------------------
        
        LimparPlacar = new JButton("<html>" + " Limpar" + "<br>" + "Placar" + "</html>");                                         
        LimparPlacar.setBounds(5,295,85,40);                       
        PanelEstatisticas.add(LimparPlacar);                           
        LimparPlacar.addActionListener(handler);
        
        //--------------------------------------
        
        this.setSize(900,500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    JLabel LabelListaDeApostas,LabelTituloLista;
    JButton ButtonSair;
    JPanel PanelListaDeApostas;
    JFrame CacaNiquelLista;
    String ListaDeApostas,TituloListaDeApostas;
    public void CacaNiquelLista()
    {
        CacaNiquelLista = new JFrame("Caca Niquel");
        CacaNiquelLista.setLayout(new BorderLayout());
        //--------------------------------------
        PanelListaDeApostas = new JPanel();                                             
        PanelListaDeApostas.setBounds(0,0,550,500);                     
        PanelListaDeApostas.setLayout(null);                            
        PanelListaDeApostas.setBorder(BorderFactory.createTitledBorder(""));                
        PanelListaDeApostas.setBackground(Color.LIGHT_GRAY);                        
        CacaNiquelLista.add(BorderLayout.CENTER,PanelListaDeApostas);
        //--------------------------------------
        TituloListaDeApostas = "Lista de apostas";
        
        LabelTituloLista = new JLabel(TituloListaDeApostas,SwingConstants.CENTER);      
        LabelTituloLista.setBounds(20,20,320,30);                       
        PanelListaDeApostas.add(LabelTituloLista);                      
        LabelTituloLista.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelTituloLista.setBorder(BorderFactory.createTitledBorder(""));           
        LabelTituloLista.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        ListaDeApostas = "<html>Lista de apostas:"+"<br><br>"+
        "100 = 1 Moeda"+"<br>"+
        "1000 = 10 Moedas"+"<br>"+
        "10000 = 100 Moedas"+"<br>"+
        "100000 = 1000 Moedas"+"<br>"+
        "100000 = 10000 Moedas"+"<br>"+
        "1000000 = 100000 Moedas"+"<br>"+
        "10000000 = 1000000 Moedas"+"<br>"+
        "</html>";
        
        LabelListaDeApostas = new JLabel(ListaDeApostas,SwingConstants.CENTER);         
        LabelListaDeApostas.setBounds(20,60,320,260);                   
        PanelListaDeApostas.add(LabelListaDeApostas);                   
        LabelListaDeApostas.setFont(new Font("Times New Roman",Font.BOLD,20));              
        LabelListaDeApostas.setBorder(BorderFactory.createTitledBorder(""));        
        LabelListaDeApostas.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        ButtonSair = new JButton("Sair");                                               
        ButtonSair.setBounds(20,330,100,30);                            
        PanelListaDeApostas.add(ButtonSair);                            
        ButtonSair.addActionListener(handler);
        //--------------------------------------
        CacaNiquelLista.setSize(360,400);
        CacaNiquelLista.setVisible(true);
        CacaNiquelLista.setResizable(false);
        CacaNiquelLista.setLocationRelativeTo(null);
    }
    
    JLabel LabelAjudaAposta,LabelAjudaTitulo;
    JButton ButtonVoltar;
    JPanel PanelAjudaAposta;
    JFrame AjudaCacaNiquel;
    String AjudaApostaTitulo,AjudaApostaUsuario;
    public void AjudaCacaNiquel()
    {
        AjudaCacaNiquel = new JFrame("Tela de Ajuda");
        AjudaCacaNiquel.setLayout(new BorderLayout());
        //--------------------------------------
        PanelAjudaAposta = new JPanel();                                                
        PanelAjudaAposta.setBounds(0,0,550,500);                        
        PanelAjudaAposta.setLayout(null);                               
        PanelAjudaAposta.setBorder(BorderFactory.createTitledBorder(""));                   
        PanelAjudaAposta.setBackground(Color.LIGHT_GRAY);                           
        AjudaCacaNiquel.add(BorderLayout.CENTER,PanelAjudaAposta);
        //--------------------------------------
        AjudaApostaTitulo = "Ajuda ao Usuario";
        
        LabelAjudaTitulo = new JLabel(AjudaApostaTitulo,SwingConstants.CENTER);         
        LabelAjudaTitulo.setBounds(20,20,320,30);                       
        PanelAjudaAposta.add(LabelAjudaTitulo);                         
        LabelAjudaTitulo.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelAjudaTitulo.setBorder(BorderFactory.createTitledBorder(""));           
        LabelAjudaTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        AjudaApostaUsuario = "<html>"+
        "No campo Valor da aposta digite valor para "+"<br>"+
        "apostar. Esse valor sera um convertido em "+"<br>"+
        "moedas para serem utilizadas nas jogadas. "+"<br>"+
        "Para consultar a lista de apostas aperte "+"<br>"+
        "Lista. Aperte Inicio/Start para começar a "+"<br>"+
        "jogar no Caça Niquel."+"<br>"+
        "--- Legenda do Placar --- "+"<br>" +
        "-Vitorias: quantidade de vitorias do usuario."+"<br>"+
        "-Especiais: Quantidade de 7-7-7 sorteados "+"<br>"+ 
        "pelo usuario."+"<br>"+
        "-Triplas: Quantidade de trios de numeros "+"<br>"+ 
        "sorteados pelo usuario."+"<br>"+
        "-Duplas: Quantidade de duplas de numeros "+"<br>"+ 
        "sorteadas pelo usuario."+"<br>"+
        "-Jogadas: Partidas realizdas pelo usuario."+"<br>"+
        "</html>";
        
        LabelAjudaAposta = new JLabel(AjudaApostaUsuario,SwingConstants.CENTER);        
        LabelAjudaAposta.setBounds(20,60,320,260);                      
        PanelAjudaAposta.add(LabelAjudaAposta);                         
        LabelAjudaAposta.setFont(new Font("Times New Roman",Font.BOLD,14));                 
        LabelAjudaAposta.setBorder(BorderFactory.createTitledBorder(""));           
        LabelAjudaAposta.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        ButtonVoltar = new JButton("Voltar");                                           
        ButtonVoltar.setBounds(20,330,100,30);                          
        PanelAjudaAposta.add(ButtonVoltar);                             
        ButtonVoltar.addActionListener(handler);
        //--------------------------------------
        AjudaCacaNiquel.setSize(360,400);
        AjudaCacaNiquel.setVisible(true);
        AjudaCacaNiquel.setResizable(false);
        AjudaCacaNiquel.setLocationRelativeTo(null);
    }
    
    JLabel LabelSobreAposta,LabelSobreTitulo;
    JButton ButtonVoltar1;
    JPanel PanelSobreAposta;
    JFrame SobreCacaNiquel;
    String SobreApostaTitulo,SobreApostaUsuario;
    public void SobreCacaNiquel()
    {
        SobreCacaNiquel = new JFrame("Tela de Ajuda");
        SobreCacaNiquel.setLayout(new BorderLayout());
        PanelSobreAposta = new JPanel();                                                
        PanelSobreAposta.setBounds(0,0,550,500);                        
        PanelSobreAposta.setLayout(null);                               
        PanelSobreAposta.setBorder(BorderFactory.createTitledBorder(""));                   
        PanelSobreAposta.setBackground(Color.LIGHT_GRAY);                           
        SobreCacaNiquel.add(BorderLayout.CENTER,PanelSobreAposta);
        //--------------------------------------
        SobreApostaTitulo = "Ajuda ao Usuario";
        
        LabelSobreTitulo = new JLabel(SobreApostaTitulo,SwingConstants.CENTER);         
        LabelSobreTitulo.setBounds(20,20,320,30);                       
        PanelSobreAposta.add(LabelSobreTitulo);                         
        LabelSobreTitulo.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelSobreTitulo.setBorder(BorderFactory.createTitledBorder(""));           
        LabelSobreTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        SobreApostaUsuario = "<html>"+"<br>"+
        "Progama feito em Java"+"<br>"+
        "</html>";
        
        LabelSobreAposta = new JLabel(SobreApostaUsuario,SwingConstants.CENTER);        
        LabelSobreAposta.setBounds(20,60,320,260);                      
        PanelSobreAposta.add(LabelSobreAposta);                         
        LabelSobreAposta.setFont(new Font("Times New Roman",Font.BOLD,20));                 
        LabelSobreAposta.setBorder(BorderFactory.createTitledBorder(""));           
        LabelSobreAposta.setHorizontalTextPosition(SwingConstants.CENTER);
        //--------------------------------------
        ButtonVoltar1 = new JButton("Voltar");                                          
        ButtonVoltar1.setBounds(20,330,100,30);                         
        PanelSobreAposta.add(ButtonVoltar1);                            
        ButtonVoltar1.addActionListener(handler);
        //--------------------------------------
        SobreCacaNiquel.setSize(360,400);
        SobreCacaNiquel.setVisible(true);
        SobreCacaNiquel.setResizable(false);
        SobreCacaNiquel.setLocationRelativeTo(null);
    }
    
    JFrame ResultadoCacaNiquel;
    JButton ButtonVoltar2;
    JPanel PanelResultadoAposta;
    public void ResultadoCacaNiquel()
    {
        ResultadoCacaNiquel = new JFrame("Resultado");
        ResultadoCacaNiquel.setLayout(new BorderLayout());
        //--------------------------------------
        PanelResultadoAposta = new JPanel();                                                
        PanelResultadoAposta.setBounds(0,0,550,500);                        
        PanelResultadoAposta.setLayout(new BorderLayout());                               
        PanelResultadoAposta.setBorder(BorderFactory.createTitledBorder(""));                   
        PanelResultadoAposta.setBackground(Color.LIGHT_GRAY);                           
        ResultadoCacaNiquel.add(BorderLayout.CENTER,PanelResultadoAposta);
        
        //--------------------------------------
        
        ButtonVoltar2 = new JButton(NumeroImagem9);                                          
        ButtonVoltar2.setBounds(0,0,100,30);                         
        PanelResultadoAposta.add(BorderLayout.CENTER,ButtonVoltar2);                        
        ButtonVoltar2.addActionListener(handler);
        //--------------------------------------
        
        ResultadoCacaNiquel.setSize(360,400);
        ResultadoCacaNiquel.setVisible(true);
        ResultadoCacaNiquel.setResizable(false);
        ResultadoCacaNiquel.setLocationRelativeTo(null);
    }
    
    String xx,xy,xl,xm;
    ImageIcon NumeroImagem9,NumeroImagem10;
    int xz,xk,xn,xh;
    double n1,n2,n3;
    int m1,m2,m3;
    int kx = 0;// Numero de vitorias do usuario
    int ky = 0;// Numero de 7-7-7 sorteados pelo usuario
    int kz = 0;// Numero de trios de numeros sorteados pelo usuario
    int kw = 0;// Numero de duplas de numeros sorteados pelo usuario
    int kn = 0;// Numero de partidas realizadas pelo usuario
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == Aposta)
            {
                if(NumeroResultadoTela.getText().isEmpty())
                {
                   ResultadoApostado.setText(" " + "********");
                   JOptionPane.showMessageDialog(null,"Aposte um valor para poder jogar");
                }
                else
                {
                    xx = NumeroResultadoTela.getText();
                    ResultadoApostado.setText(" "+xx);
                    if(NumeroResultadoTela.getText().length()!= 0)
                    {
                        //JTextField que aceita somente numeros
                        try
                        {
                            //JTextField que aceita inteiros
                            try
                            {
                                xz = Integer.parseInt(xx.trim());//xx.trim() Retira os espaços da String
                                NumeroResultadoTela.requestFocusInWindow();
                                if(xz<100)
                                {
                                   JOptionPane.showMessageDialog(null,"<html>"+"Digite um valor acima de 100"+
                                   "<br>"+"para iniciar o jogo no caça niquel</html>");
                                   ResultadoApostado.setText(" " + "********");
                                }
                                else
                                {
                                   xk =(xz)/100;
                                   xl = " " + xk + " ";
                                   LabelValorAposta.setText(""+xl);
                                }
                            }
                            catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(null,"Digite numeros inteiros somente");
                                NumeroResultadoTela.setText("");
                                ResultadoApostado.setText(" " + "********");
                                NumeroResultadoTela.requestFocusInWindow();
                                return;
                            }
                        }
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null,"Esse campo aceita apenas numeros");
                            NumeroResultadoTela.setText("");
                            ResultadoApostado.setText(" " + "********");
                        }
                    }
                }
            }
            
            else if(event.getSource() == Inicio)
            {
                if(NumeroResultadoTela.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Aposte um valor para poder jogar");
                }
                else
                {
                    if(xk <= 0)
                    {
                        JOptionPane.showMessageDialog(null,"Para poder jogar mais, aposte mais valores");
                    }
                    else
                    {
                        n1 = (1 + Math.round( Math.random() * 8 ) ); 
                        n2 = (1 + Math.round( Math.random() * 8 ) );
                        n3 = (1 + Math.round( Math.random() * 8 ) );
                        //--------------------------------------
                        m1 = (int)n1;
                        m2 = (int)n2;
                        m3 = (int)n3;
                        //--------------------------------------
                        if(n1 == n2 || n1 == n2 || n2 == n3)
                        {
                            LabelResultadoAposta.setText("Ganhou");
                            //--------------------------------------
                            ButtonResultadoAposta.setVisible(true);
                            //--------------------------------------
                            ButtonVoltar2 = new JButton();
                            NumeroImagem9 = new ImageIcon("Premio2Icone.PNG");          
                            NumeroImagem9.setImage(NumeroImagem9.getImage().getScaledInstance(300,300,165));     
                            ButtonVoltar2.setIcon(NumeroImagem9);
                            ButtonVoltar2.setText(""+NumeroImagem9);
                            kx += 1;
                            kw += 1;
                            kn += 1;
                            if(n1 == n2 && n1 == n3 && n2 == n3)
                            {
                                if(n1 == 7 && n2 == 7 && n3 == 7)
                                {
                                    LabelResultadoAposta.setText("Ganhou!!!!!!!");
                                    //--------------------------------------
                                    ButtonResultadoAposta.setVisible(true);
                                    //--------------------------------------
                                    ButtonVoltar2 = new JButton();  
                                    NumeroImagem9 = new ImageIcon("PremioEspecialIcone.PNG");          
                                    NumeroImagem9.setImage(NumeroImagem9.getImage().getScaledInstance(300,300,165));     
                                    ButtonVoltar2.setIcon(NumeroImagem9);
                                    ButtonVoltar2.setText(""+NumeroImagem9);
                                    //--------------------------------------
                                    kx += 1;
                                    ky += 1;
                                    kz += 1;
                                    kn += 1;
                                    
                                }
                                else
                                {
                                    LabelResultadoAposta.setText("Ganhou");
                                    //--------------------------------------
                                    ButtonResultadoAposta.setVisible(true);
                                    //--------------------------------------
                                    ButtonVoltar2 = new JButton();  
                                    NumeroImagem9 = new ImageIcon("Premio1Icone.PNG");          
                                    NumeroImagem9.setImage(NumeroImagem9.getImage().getScaledInstance(300,300,165));     
                                    ButtonVoltar2.setIcon(NumeroImagem9); 
                                    ButtonVoltar2.setText(""+NumeroImagem9);
                                    xz = xz - 100;
                                    xh = xz;
                                    xm = " " + xh + " ";
                                    ResultadoApostado.setText(""+xm);
                                    NumeroResultadoTela.setText(""+xm);
                                    xk = xk - 1;
                                    xn = xk;
                                    xl = " " + xn + " ";
                                    LabelValorAposta.setText(""+xl);
                                    kx += 1;
                                    kz += 1;
                                    kn += 1;
                                }
                            }
                        }
                        else
                        {
                            LabelResultadoAposta.setText("Tente outra vez");
                            //--------------------------------------
                            ButtonResultadoAposta.setVisible(true);
                            //--------------------------------------
                            ButtonVoltar2 = new JButton();  
                            NumeroImagem9 = new ImageIcon("BotaoTenteOutraVezIcone.PNG");          
                            NumeroImagem9.setImage(NumeroImagem9.getImage().getScaledInstance(300,300,165));     
                            ButtonVoltar2.setIcon(NumeroImagem9);
                            ButtonVoltar2.setText(""+NumeroImagem9);
                            //--------------------------------------
                            xz = xz - 100;
                            xh = xz;
                            xm = " " + xh + " ";
                            ResultadoApostado.setText(""+xm);
                            NumeroResultadoTela.setText(""+xm);
                            xk = xk - 1;
                            xn = xk;
                            xl = " " + xn + " ";
                            LabelValorAposta.setText(""+xl);
                            kn += 1;
                        }
                        //--------------------------------------
                        ImageIcon NumeroImagem4 = new ImageIcon(m1 +".PNG");          
                        NumeroImagem4.setImage(NumeroImagem4.getImage().getScaledInstance(120,120,165));     
                        LabelAposta1.setIcon(NumeroImagem4);
                        LabelAposta1.setText(" "); 
                        LabelAposta1.setFont(new Font("Times New Roman",Font.BOLD,1));
                        //--------------------------------------
                        ImageIcon NumeroImagem5 = new ImageIcon(m2 +".PNG");          
                        NumeroImagem5.setImage(NumeroImagem5.getImage().getScaledInstance(120,120,165));     
                        LabelAposta2.setIcon(NumeroImagem5);
                        LabelAposta2.setText(" "); 
                        LabelAposta2.setFont(new Font("Times New Roman",Font.BOLD,1));
                        //--------------------------------------
                        ImageIcon NumeroImagem6 = new ImageIcon(m3 +".PNG");          
                        NumeroImagem6.setImage(NumeroImagem6.getImage().getScaledInstance(120,120,165));     
                        LabelAposta3.setIcon(NumeroImagem6);
                        LabelAposta3.setText(" "); 
                        LabelAposta3.setFont(new Font("Times New Roman",Font.BOLD,1));
                        //--------------------------------------
                        LabelAposta1.setText(" " + NumeroImagem4 + " ");
                        LabelAposta2.setText(" " + NumeroImagem5 + " ");
                        LabelAposta3.setText(" " + NumeroImagem6 + " ");
                        //--------------------------------------
                        LabelVitoriasDoJogador.setText("<html>" + "Vitorias:" + "<br>" + kx + "<br>" + "</html>");
                        LabelCombinacoesEspeciais.setText("<html>" + "Especiais:" + "<br>" + ky + "<br>" + "</html>");
                        LabelCombinacoesTriplas.setText("<html>" + "Triplas:" + "<br>" + kz + "<br>" + "</html>");
                        LabelCombinacoesDuplas.setText("<html>" + "Duplas:" + "<br>" + kw + "<br>" + "</html>");
                        LabelPartidasJogadas.setText("<html>" + "Jogadas:" + "<br>" + kn + "<br>" + "</html>");
                        //--------------------------------------
                    }
                }
            }
            
            else if(event.getSource() == Lista)
            {
                CacaNiquelLista();
            }
            
            else if(event.getSource() == Ajuda)
            {
                AjudaCacaNiquel();
            }

            else if(event.getSource() == Sobre)
            {
                SobreCacaNiquel();
            }
            
            else if(event.getSource() == Limpar)
            {
                NumeroResultadoTela.setText(" ");
                LabelValorAposta.setText(" " + "*****" + " ");
                ResultadoApostado.setText(" " + "********");
                //--------------------------------------
                ButtonResultadoAposta.setVisible(false);
                //--------------------------------------
                ImageIcon NumeroImagem4 = new ImageIcon("N.PNG");          
                NumeroImagem4.setImage(NumeroImagem4.getImage().getScaledInstance(120,120,165));     
                LabelAposta1.setIcon(NumeroImagem4);LabelAposta1.setText(" ");
                //--------------------------------------
                ImageIcon NumeroImagem5 = new ImageIcon("N.PNG");          
                NumeroImagem5.setImage(NumeroImagem5.getImage().getScaledInstance(120,120,165));     
                LabelAposta2.setIcon(NumeroImagem5);LabelAposta2.setText(" ");  
                //--------------------------------------
                ImageIcon NumeroImagem6 = new ImageIcon("N.PNG");          
                NumeroImagem6.setImage(NumeroImagem6.getImage().getScaledInstance(120,120,165));     
                LabelAposta3.setIcon(NumeroImagem6);LabelAposta3.setText(" "); 
                //--------------------------------------
                LabelResultadoAposta.setText("*******");
            }
             
            else if(event.getSource() == LimparPlacar)
            {
                 kx = 0;
                 ky = 0;
                 kz = 0;
                 kw = 0;
                 kn = 0;
                 LabelVitoriasDoJogador.setText("<html>" + "Vitorias:" + "<br>" + "***" + "<br>" + "</html>");
                 LabelCombinacoesEspeciais.setText("<html>" + "Especiais:" + "<br>" + "***" + "<br>" + "</html>");
                 LabelCombinacoesTriplas.setText("<html>" + "Triplas:" + "<br>" + "***" + "<br>" + "</html>");
                 LabelCombinacoesDuplas.setText("<html>" + "Duplas:" + "<br>" + "***" + "<br>" + "</html>");
                 LabelPartidasJogadas.setText("<html>" + "Jogadas:" + "<br>" + "***" + "<br>" + "</html>");
            }
             
            else if(event.getSource() == ButtonResultadoAposta)
            {
                ResultadoCacaNiquel();
            }
            
            else if(event.getSource() == Sair)
            {
                int Opcao; Opcao  = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Sair do programa",JOptionPane.YES_NO_OPTION);
                if (Opcao  == JOptionPane.YES_OPTION){System.exit(0);}
            }
            
            else if(event.getSource() == ButtonSair)
            {
                CacaNiquelLista.setVisible(false);}
            
            else if(event.getSource() == ButtonVoltar)
            {
                AjudaCacaNiquel.setVisible(false);
            }
            
            else if(event.getSource() == ButtonVoltar1)
            {
                SobreCacaNiquel.setVisible(false);
            }
            
            else if(event.getSource() == ButtonVoltar2)
            {
                ResultadoCacaNiquel.setVisible(false);
            }
        }
    } 
}