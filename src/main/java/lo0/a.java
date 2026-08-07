package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import po0.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Llo0/a;", "T", "Lpo0/c;", Gender.UNKNOWN, "Llo0/n;", "<init>", "()V", "intermediate", DateTokenConverter.CONVERTER_KEY, "(Lpo0/c;)Ljava/lang/Object;", "", "input", "a", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "Lno0/f;", "b", "()Lno0/f;", "actualFormat", "c", "()Lpo0/c;", "emptyIntermediate", "Llo0/l;", "Llo0/y;", "Llo0/a0;", "Llo0/o0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a<T, U extends po0.c<U>> implements n<T> {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // lo0.n
    public T a(CharSequence input) {
        CharSequence charSequence;
        String str;
        p013kotlin.jvm.internal.s.k(input, "input");
        try {
            charSequence = input;
            try {
                try {
                    return d(po0.k.c(po0.k.a(b().b()), charSequence, c(), 0, 4, null));
                } catch (IllegalArgumentException e11) {
                    String message = e11.getMessage();
                    if (message == null) {
                        str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                    } else {
                        str = message + " (when parsing '" + ((Object) charSequence) + "')";
                    }
                    throw new DateTimeFormatException(str, e11);
                }
            } catch (ParseException e12) {
                e = e12;
                throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + CoreConstants.SINGLE_QUOTE_CHAR, e);
            }
        } catch (ParseException e13) {
            e = e13;
            charSequence = input;
        }
    }

    public abstract no0.f<U> b();

    public abstract U c();

    public abstract T d(U intermediate);

    private a() {
    }
}
