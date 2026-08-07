package ezvcard.parameter;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameter;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes8.dex */
public class d<T extends VCardParameter> extends ezvcard.util.a<T, String> {
    public d(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T c(String str) {
        try {
            try {
                Constructor<T> declaredConstructor = this.f63660a.getDeclaredConstructor(String.class);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(str);
            } catch (Exception unused) {
                Constructor<T> declaredConstructor2 = this.f63660a.getDeclaredConstructor(String.class, VCardVersion[].class);
                declaredConstructor2.setAccessible(true);
                return declaredConstructor2.newInstance(str, new VCardVersion[0]);
            }
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean h(T t11, String str) {
        return t11.b().equalsIgnoreCase(str);
    }
}
