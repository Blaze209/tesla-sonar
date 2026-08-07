package ab0;

import java.lang.reflect.Field;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lab0/e;", "Lcom/google/gson/d;", "<init>", "()V", "Ljava/lang/reflect/Field;", "field", "", "translateName", "(Ljava/lang/reflect/Field;)Ljava/lang/String;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e implements com.google.gson.d {
    @Override // com.google.gson.d
    public String translateName(Field field) {
        String fieldName = com.google.gson.c.IDENTITY.translateName(field);
        s.j(fieldName, "fieldName");
        if (t.L(fieldName, "_", false, 2, null)) {
            s.j(fieldName, "fieldName");
            fieldName = t.C1(fieldName, '_', null, 2, null);
        }
        s.j(fieldName, "fieldName");
        return fieldName;
    }
}
