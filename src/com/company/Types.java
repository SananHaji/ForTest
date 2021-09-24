package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.company.Types.MILES;
import static com.company.Types.HEARTS;
import static com.company.Types.UMICO;
import static com.company.Types.TAXREFUND;
import static com.company.Types.CASHBACK;

@IntDef({MILES, HEARTS, UMICO, TAXREFUND, CASHBACK})
@Retention(RetentionPolicy.SOURCE)
@interface Types {
        int MILES = 1;

        int HEARTS = 2;

        int UMICO = 3;

        int TAXREFUND = 4;

        int CASHBACK = 5;

        int[] values = {MILES, HEARTS, UMICO, TAXREFUND, CASHBACK};
}
