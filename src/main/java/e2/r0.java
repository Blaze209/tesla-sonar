package e2;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Le2/q0;", "b", "()Le2/q0;", "Landroid/view/inputmethod/EditorInfo;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Le2/l0;", "a", "Lwn0/l;", "c", "()Lwn0/l;", "setInputMethodManagerFactory", "(Lwn0/l;)V", "getInputMethodManagerFactory$annotations", "()V", "inputMethodManagerFactory", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static wn0.l<? super View, ? extends l0> f61526a = a.f61527a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l<View, m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f61527a = new a();

        a() {
            super(1, m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m0 invoke(View view) {
            return new m0(view);
        }
    }

    public static final q0 b() {
        return new e2.a();
    }

    public static final wn0.l<View, l0> c() {
        return f61526a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e.c().r(editorInfo);
        }
    }
}
