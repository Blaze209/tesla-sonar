package a3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "La3/g;", "a", "(Ljava/util/Map;Lwn0/l;)La3/g;", "", "c", "(Ljava/lang/CharSequence;)Z", "Lr2/g2;", "Lr2/g2;", DateTokenConverter.CONVERTER_KEY, "()Lr2/g2;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<g> f101a = w.f(a.f102c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La3/g;", "b", "()La3/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f102c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return null;
        }
    }

    public static final g a(Map<String, ? extends List<? extends Object>> map, wn0.l<Object, Boolean> lVar) {
        return new h(map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!p013kotlin.text.a.c(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static final g2<g> d() {
        return f101a;
    }
}
