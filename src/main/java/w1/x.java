package w1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J;\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJa\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H'¢\u0006\u0004\b\u0010\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lw1/x;", "", Action.KEY_ATTRIBUTE, CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlin/Function1;", "Lw1/c;", "Ljn0/h0;", "content", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", DateTokenConverter.CONVERTER_KEY, "(ILwn0/l;Lwn0/l;Lwn0/r;)V", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f120464c = new a();

        a() {
            super(1);
        }

        public final Void a(int i11) {
            return null;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void a(x xVar, Object obj, Object obj2, wn0.q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        xVar.f(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(x xVar, int i11, wn0.l lVar, wn0.l lVar2, wn0.r rVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        if ((i12 & 4) != 0) {
            lVar2 = a.f120464c;
        }
        xVar.d(i11, lVar, lVar2, rVar);
    }

    static /* synthetic */ void e(x xVar, Object obj, Object obj2, wn0.q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        xVar.b(obj, obj2, qVar);
    }

    default void b(Object key, Object contentType, wn0.q<? super c, ? super p020r2.l, ? super Integer, h0> content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void d(int count, wn0.l<? super Integer, ? extends Object> key, wn0.l<? super Integer, ? extends Object> contentType, wn0.r<? super c, ? super Integer, ? super p020r2.l, ? super Integer, h0> itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }

    void f(Object key, Object contentType, wn0.q<? super c, ? super p020r2.l, ? super Integer, h0> content);
}
