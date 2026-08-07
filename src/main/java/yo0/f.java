package yo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJI\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\nH&¢\u0006\u0004\b\u0018\u0010\u000eJE\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u001b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lyo0/f;", "", "T", "Lco0/d;", "kClass", "Lro0/d;", "serializer", "Ljn0/h0;", "a", "(Lco0/d;Lro0/d;)V", "Lkotlin/Function1;", "", "provider", "c", "(Lco0/d;Lwn0/l;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", DateTokenConverter.CONVERTER_KEY, "(Lco0/d;Lco0/d;Lro0/d;)V", "Lro0/q;", "defaultSerializerProvider", "e", "", "Lro0/c;", "defaultDeserializerProvider", "b", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static <T> void b(f fVar, co0.d<T> kClass, final ro0.d<T> serializer) {
            s.k(kClass, "kClass");
            s.k(serializer, "serializer");
            fVar.c(kClass, new l() { // from class: yo0.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return f.a.c(serializer, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ro0.d c(ro0.d dVar, List it) {
            s.k(it, "it");
            return dVar;
        }
    }

    <T> void a(co0.d<T> kClass, ro0.d<T> serializer);

    <Base> void b(co0.d<Base> baseClass, l<? super String, ? extends ro0.c<? extends Base>> defaultDeserializerProvider);

    <T> void c(co0.d<T> kClass, l<? super List<? extends ro0.d<?>>, ? extends ro0.d<?>> provider);

    <Base, Sub extends Base> void d(co0.d<Base> baseClass, co0.d<Sub> actualClass, ro0.d<Sub> actualSerializer);

    <Base> void e(co0.d<Base> baseClass, l<? super Base, ? extends q<? super Base>> defaultSerializerProvider);
}
