import java.time.*;
public class Atendimento {
	
	private String estado;
	
	public String horario() {
	Clock horarioSistema = Clock.systemDefaultZone();
	LocalTime meioDia = LocalTime.of(12,0);
	LocalTime seisHoras = LocalTime.of(18, 0);
		
	LocalTime hora = LocalTime.now(horarioSistema);
	
		if (hora.isBefore(meioDia)) estado = "Bom Dia";
		else if (hora.isBefore(seisHoras)) estado = "Boa Tarde";
		else estado = "Boa noite";	
		return estado;
	}
}