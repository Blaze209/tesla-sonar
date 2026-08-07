package po0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\u001a=\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Object", "Type", "Lpo0/a;", "receiver", "value", "Lpo0/g;", "f", "(Lpo0/a;Ljava/lang/Object;Ljava/lang/Object;)Lpo0/g;", "", "", "start", "end", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/CharSequence;II)I", "e", "(Ljava/lang/CharSequence;II)Ljava/lang/Integer;", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(CharSequence charSequence, int i11, int i12) {
        int iA = 0;
        while (i11 < i12) {
            iA = (iA * 10) + mo0.d.a(charSequence.charAt(i11));
            i11++;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e(CharSequence charSequence, int i11, int i12) {
        int iA = 0;
        while (i11 < i12) {
            iA = (iA * 10) + mo0.d.a(charSequence.charAt(i11));
            if (iA < 0) {
                return null;
            }
            i11++;
        }
        return Integer.valueOf(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> g f(a<? super Object, Type> aVar, Object object, Type type) {
        Type typeC = aVar.c(object, type);
        if (typeC == null) {
            return null;
        }
        return new g.a(typeC);
    }
}
