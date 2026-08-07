package com.fourthline.adapters.kyc;

import com.fourthline.adapters.common.DateFormat;
import com.fourthline.core.Gender;
import com.fourthline.kyc.Person;
import com.fourthline.scanners.config.orca.kyc.model.PersonModel;
import java.util.Date;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/fourthline/adapters/kyc/PersonModelMapperImpl;", "Lcom/fourthline/adapters/kyc/PersonModelMapper;", "<init>", "()V", "map", "Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "person", "Lcom/fourthline/kyc/Person;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersonModelMapperImpl implements PersonModelMapper {
    @Override // com.fourthline.adapters.kyc.PersonModelMapper
    public PersonModel map(Person person) {
        String str;
        s.k(person, "person");
        String firstName = person.getFirstName();
        String middleName = person.getMiddleName();
        String lastName = person.getLastName();
        Gender gender = person.getGender();
        if (gender != null) {
            String lowerCase = gender.toString().toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            str = lowerCase;
        } else {
            str = null;
        }
        String nationalityCode = person.getNationalityCode();
        String birthCountryCode = person.getBirthCountryCode();
        String birthPlace = person.getBirthPlace();
        Date birthDate = person.getBirthDate();
        return new PersonModel(firstName, middleName, lastName, str, nationalityCode, birthCountryCode, birthPlace, birthDate != null ? DateFormat.SHORT.toUtcDateFormat(birthDate.getTime()) : null);
    }
}
