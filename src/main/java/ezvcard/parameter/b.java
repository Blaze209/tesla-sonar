package ezvcard.parameter;

import ezvcard.parameter.MediaTypeParameter;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes8.dex */
public class b<T extends MediaTypeParameter> extends ezvcard.util.a<T, String[]> {
    public b(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T c(String[] strArr) {
        try {
            Constructor<T> declaredConstructor = this.f63660a.getDeclaredConstructor(String.class, String.class, String.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean h(T t11, String[] strArr) {
        String[] strArr2 = {t11.b(), t11.e(), t11.d()};
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (str != null && !str.equalsIgnoreCase(strArr2[i11])) {
                return false;
            }
        }
        return true;
    }
}
