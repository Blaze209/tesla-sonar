package expo.modules.contacts.models;

import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/contacts/models/BirthdayModel;", "Lexpo/modules/contacts/models/DateModel;", "<init>", "()V", "", "", "", "readableMap", "Ljn0/h0;", "fromMap", "(Ljava/util/Map;)V", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BirthdayModel extends DateModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, ? extends Object> readableMap) {
        s.k(readableMap, "readableMap");
        super.fromMap(readableMap);
        getMap().putString(AnnotatedPrivateKey.LABEL, DateModelKt.BIRTHDAY);
    }
}
