package expo.modules.kotlin.tracing;

import eb.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.q;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"T", "", "blockName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lwn0/a;)Ljava/lang/Object;", "tag", "(Ljava/lang/String;Ljava/lang/String;Lwn0/a;)Ljava/lang/Object;", "Ljn0/h0;", "beginTraceBlock", "(Ljava/lang/String;Ljava/lang/String;)V", "endTraceBlock", "()V", "", "cookie", "beginAsyncTraceBlock", "(Ljava/lang/String;Ljava/lang/String;I)V", "endAsyncTraceBlock", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExpoTraceKt {
    public static final void beginAsyncTraceBlock(String tag, String blockName, int i11) {
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        a.a("[" + tag + "] " + blockName, i11);
    }

    public static /* synthetic */ void beginAsyncTraceBlock$default(String tag, String blockName, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        a.a("[" + tag + "] " + blockName, i11);
    }

    public static final void beginTraceBlock(String tag, String blockName) {
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        a.c("[" + tag + "] " + blockName);
    }

    public static final void endAsyncTraceBlock(String tag, String blockName, int i11) {
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        a.d("[" + tag + "] " + blockName, i11);
    }

    public static /* synthetic */ void endAsyncTraceBlock$default(String tag, String blockName, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        a.d("[" + tag + "] " + blockName, i11);
    }

    public static final void endTraceBlock() {
        a.f();
    }

    public static final <T> T trace(String tag, String blockName, wn0.a<? extends T> block) {
        s.k(tag, "tag");
        s.k(blockName, "blockName");
        s.k(block, "block");
        a.c("[" + tag + "] " + blockName);
        try {
            return block.invoke();
        } finally {
            q.b(1);
            a.f();
            q.a(1);
        }
    }

    public static final <T> T trace(String blockName, wn0.a<? extends T> block) {
        s.k(blockName, "blockName");
        s.k(block, "block");
        a.c("[ExpoModulesCore] " + blockName);
        try {
            return block.invoke();
        } finally {
            q.b(1);
            a.f();
            q.a(1);
        }
    }
}
