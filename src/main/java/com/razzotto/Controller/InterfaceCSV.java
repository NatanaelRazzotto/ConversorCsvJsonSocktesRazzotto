package com.razzotto.Controller;

import org.apache.commons.csv.CSVRecord;

public interface InterfaceCSV {//Issa interface permite fazer um vinculo entre dois objetos um vinculo de confian�a. 
										//onde um implementa as regras da interface e ai assim a outra classe que recebe o THIs
										//Reconhece que � um ambito

	//public void terminouLeituraCSV();
	public void setContinuaLeituraCSV(boolean terminou);
	public void addRegistroCSV(CSVRecord csvrecord);
	public void SetTempoInicial();
	void SetTempoFinal();
}
