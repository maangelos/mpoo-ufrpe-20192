package ufrpe;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Horario {
	private String horaFormatada;
	private String minFormatada;
	private String segFormatada;
	private String horarioFormatada;
	
	public String getHora() {
		Date hora = new Date();
		SimpleDateFormat formatarHora = new SimpleDateFormat("H");
		horaFormatada = formatarHora.format(hora);	
		return horaFormatada;
	}
	
	public String getMinuto() {
		Date minuto = new Date();
		SimpleDateFormat formatarMin = new SimpleDateFormat("m");
		minFormatada = formatarMin.format(minuto);	
		return minFormatada;
	}
	
	public String getSegundo() {
		Date segundo = new Date();
		SimpleDateFormat formatarSeg = new SimpleDateFormat("s");
		segFormatada = formatarSeg.format(segundo);	
		return segFormatada;
	}
	
	public String getHorario() {
		horarioFormatada = this.getHora()+":"+this.getMinuto()+":"+this.getSegundo();
		return horarioFormatada;
	}
}
