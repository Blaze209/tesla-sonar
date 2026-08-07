package u20;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import java.lang.Enum;
import java.util.Arrays;
import v20.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a<T extends Enum<T>> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class<T> f115306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String[] f115307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T[] f115308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k.b f115309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f115310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final T f115311f;

    a(Class<T> cls, T t11, boolean z11) {
        this.f115306a = cls;
        this.f115311f = t11;
        this.f115310e = z11;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.f115308c = enumConstants;
            this.f115307b = new String[enumConstants.length];
            int i11 = 0;
            while (true) {
                T[] tArr = this.f115308c;
                if (i11 >= tArr.length) {
                    this.f115309d = k.b.a(this.f115307b);
                    return;
                } else {
                    String strName = tArr[i11].name();
                    this.f115307b[i11] = c.n(strName, cls.getField(strName));
                    i11++;
                }
            }
        } catch (NoSuchFieldException e11) {
            throw new AssertionError("Missing field in " + cls.getName(), e11);
        }
    }

    public static <T extends Enum<T>> a<T> a(Class<T> cls) {
        return new a<>(cls, null, false);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T fromJson(k kVar) {
        int iB0 = kVar.b0(this.f115309d);
        if (iB0 != -1) {
            return this.f115308c[iB0];
        }
        String path = kVar.getPath();
        if (this.f115310e) {
            if (kVar.B() == k.c.STRING) {
                kVar.F();
                return this.f115311f;
            }
            throw new JsonDataException("Expected a string but was " + kVar.B() + " at path " + path);
        }
        throw new JsonDataException("Expected one of " + Arrays.asList(this.f115307b) + " but was " + kVar.O() + " at path " + path);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void toJson(r rVar, T t11) {
        if (t11 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.G0(this.f115307b[t11.ordinal()]);
    }

    public a<T> d(T t11) {
        return new a<>(this.f115306a, t11, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.f115306a.getName() + ")";
    }
}
