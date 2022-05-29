package com.openclassrooms.reunion.service;

import com.openclassrooms.reunion.model.Reunion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyReunionGenerator {

    public static List<Reunion> DUMMY_REUNION = Arrays.asList(
            new Reunion(1, "Réunion A", "14h00", "Saint_Pierre",
                    new String[]{"caroline@hotmail.fr", "remir2@hotmail.fr", "aimeminyem67@gmail.com"}),
            new Reunion(2, "Réunion B", "15h00", "Du_Mont",
                    new String[]{"carole@hotmail.fr", "Premir2@ymail.fr", "aimeminyem67@gmail.com","Simon@easynet@fr"} ),
            new Reunion(3, "Réunion C", "16h00", "Mengalet",
                    new String[]{"gousou@hotmail.fr", "minyem@hotmail.fr", "aimeminy@gmail.com"}),
            new Reunion(4, "Réunion D", "17h00", "Saint-Pierre",
                    new String[]{"gousou@hotmail.fr", "minyem@hotmail.fr", "aimeminy@gmail.com"}),
            new Reunion(5, "Réunion F", "18h00", "Du_Mont",
                    new String[]{"gousou@hotmail.fr", "minyem@hotmail.fr", "aimeminy@gmail.com"}),
            new Reunion(6, "Réunion G", "19h00", "Du_Mont",
                    new String[]{"gous@hotmail.fr", "ngui@camtel.fr", "aimeminy@gmail.com"}),
            new Reunion(7, "Réunion H", "20h00", "Saintserin",
                    new String[]{"amougou@hotmail.fr", "belinga@camtel.fr", "bot@gmail.com"}),
            new Reunion(8, "Réunion I", "20h30", "Palmiste",
                    new String[]{"gous@hotmail.fr", "ngui@camtel.fr", "aimeminy@gmail.com"}),
            new Reunion(9, "Réunion J", "21h00", "Saintserin",
                    new String[]{"paulB@hotmail.fr", "baleguel@etoo.fr", "sogol@ymail.com,baleguel@camtel.cm"}),
            new Reunion(10, "Réunion K", "22h00", "Palmiste",
                    new String[]{"simone@hmail.fr", "nguiaime@camtel.fr", "tonton@gmail.com"})

    );

    static List<Reunion> generateReunion() {
        return new ArrayList<>(DUMMY_REUNION);
    }

}

