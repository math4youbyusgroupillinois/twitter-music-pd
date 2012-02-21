package edu.uiuc.sigmusic.twittersounds;

public class GeneratorTest {
	public static void main(String args[]){
		MelodyGenerator m = new MelodyGenerator(50, 50, 50);
		m.generateMelody();
		
		System.out.print("Synth: \n");
		for(int i = 0; i < 64; i++){
			System.out.print(m.synth[i]);
			if(m.synth[i] < 10 && m.synth[i]> -1){
				System.out.print("   ");
			}
			else if(m.synth[i] < 100 || m.synth[i] == -1){
				System.out.print("  ");
			}
			else{
				System.out.print(" ");
			}
			
			if((i + 1) % 16 == 0) System.out.print('\n');
		}
		System.out.print('\n');
		
		System.out.print("Bass: \n");
		for(int i = 0; i < 64; i++){
			System.out.print(m.bass[i]);
			if(m.bass[i] < 10 && m.bass[i]> -1){
				System.out.print("   ");
			}
			else if(m.bass[i] < 100 || m.bass[i] == -1){
				System.out.print("  ");
			}
			else{
				System.out.print(" ");
			}
			
			if((i + 1) % 16 == 0) System.out.print('\n');
		}
		System.out.print('\n');
		
		System.out.print("Hihat: \n");
		for(int i = 0; i < 64; i++){
			System.out.print(m.hihat[i]);
			if(m.hihat[i] < 10 && m.hihat[i]> -1){
				System.out.print("   ");
			}
			else if(m.hihat[i] < 100 || m.hihat[i] == -1){
				System.out.print("  ");
			}
			else{
				System.out.print(" ");
			}
			
			if((i + 1) % 16 == 0) System.out.print('\n');
		}
		System.out.print('\n');
		
		System.out.print("Snare: \n");
		for(int i = 0; i < 64; i++){
			System.out.print(m.snare[i]);
			if(m.snare[i] < 10 && m.snare[i]> -1){
				System.out.print("   ");
			}
			else if(m.snare[i] < 100 || m.snare[i] == -1){
				System.out.print("  ");
			}
			else{
				System.out.print(" ");
			}
			
			if((i + 1) % 16 == 0) System.out.print('\n');
		}
		System.out.print('\n');
		
		System.out.print("Kick: \n");
		for(int i = 0; i < 64; i++){
			System.out.print(m.kick[i]);
			if(m.kick[i] < 10 && m.kick[i]> -1){
				System.out.print("   ");
			}
			else if(m.kick[i] < 100 || m.kick[i] == -1){
				System.out.print("  ");
			}
			else{
				System.out.print(" ");
			}
			
			if((i + 1) % 16 == 0) System.out.print('\n');
		}
		System.out.print('\n');
		System.out.print('\n');
		
		
	}
}
