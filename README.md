# SpringBoot
### progetto SpringBoot per Integrazione 3CFU programmazione ad oggetti

+ Creazione progetto con Spring Initializr
    + Visitare https://start.spring.io/ , compilare i campi 
Group, Artifact, Name, Description, selezionare la versione di Java da utilizzare, aggiungere la dipendenza “Spring Web”.
![](/img_SpringBoot/springBoot_creazioneAmbiente.jpg)

+ Srittura codice nell’IDE (nel mio caso, VisualStudio Code)
    + Importare il progetto creato nell’IDE
    + Scrivere il codice 

+ Compilazione del codice
    + Aprire una finestra Powershell o un prompt di comandi
    + Digitare “mvnw spring-boot:run” oppure eseguire il .java dall'IDE
![](/img_SpringBoot/springBoot_run.jpg)

+ Esecuzione del codice
    + Aprire “localhost:8080/toUpperCase” per la stringa di default
        
        ![](/img_SpringBoot/springBoot_testoDefault.jpg)
    + oppure aprire “localhost:8080/toUpperCase?string=InserisciQuiLaTuaStringa" per rendere maiuscola la stringa passata come parametro
    ad esempio:    
        ![](/img_SpringBoot/springBoot_testo_personalizzato.jpg)

