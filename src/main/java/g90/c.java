package g90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import i4.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jn0.h0;
import p010i90.i0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lg90/c;", "", "", PlaceTypes.COUNTRY, "Li90/i0;", "isPlacesAvailable", "", "b", "(Ljava/lang/String;Li90/i0;)Z", "a", "()Ljava/lang/String;", "googleApiKey", "", "c", "()Ljava/util/Set;", "autocompleteCountries", "Lkotlin/Function0;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/a;", "onNavigation", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        public static boolean a(c cVar, String str, i0 isPlacesAvailable) {
            boolean z11;
            String strA;
            s.k(isPlacesAvailable, "isPlacesAvailable");
            Set<String> setC = cVar.c();
            if (setC != null) {
                Set<String> set = setC;
                ArrayList arrayList = new ArrayList(v.y(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(f0.a((String) it.next(), p4.d.INSTANCE.a()));
                }
                if (v.g0(arrayList, str != null ? f0.a(str, p4.d.INSTANCE.a()) : null)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            return z11 && (isPlacesAvailable.invoke() && (strA = cVar.a()) != null && !t.y0(strA));
        }
    }

    String a();

    boolean b(String country, i0 isPlacesAvailable);

    Set<String> c();

    wn0.a<h0> d();
}
