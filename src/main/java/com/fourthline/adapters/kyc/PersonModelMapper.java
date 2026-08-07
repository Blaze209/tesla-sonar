package com.fourthline.adapters.kyc;

import com.fourthline.kyc.Person;
import com.fourthline.scanners.config.orca.kyc.model.PersonModel;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/fourthline/adapters/kyc/PersonModelMapper;", "", "map", "Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "person", "Lcom/fourthline/kyc/Person;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PersonModelMapper {
    PersonModel map(Person person);
}
