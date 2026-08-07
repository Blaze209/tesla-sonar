package com.brentvatne.exoplayer;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import vi.CMCDProps;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/brentvatne/exoplayer/c;", "", "Lvi/d;", "props", "<init>", "(Lvi/d;)V", "Lp7/y;", "mediaItem", "Ls8/e;", "e", "(Lp7/y;)Ls8/e;", "", "mode", "g", "(I)I", "Lcom/google/common/collect/y;", "", DateTokenConverter.CONVERTER_KEY, "()Lcom/google/common/collect/y;", "Lcom/google/common/collect/y$a;", "builder", Action.KEY_ATTRIBUTE, "", "Lkotlin/Pair;", "dataList", "Ljn0/h0;", "c", "(Lcom/google/common/collect/y$a;Ljava/lang/String;Ljava/util/List;)V", "value", "f", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "Ls8/e$a;", "h", "()Ls8/e$a;", "a", "Lvi/d;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CMCDProps props;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/brentvatne/exoplayer/c$a", "Ls8/e$b;", "Lcom/google/common/collect/y;", "", "b", "()Lcom/google/common/collect/y;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements s8.e.b {
        a() {
        }

        @Override // s8.e.b
        public com.google.common.collect.y<String, String> b() {
            return c.this.d();
        }
    }

    public c(CMCDProps props) {
        p013kotlin.jvm.internal.s.k(props, "props");
        this.props = props;
    }

    private final void c(com.google.common.collect.y.a<String, String> builder, String key, List<? extends Pair<String, ? extends Object>> dataList) {
        Iterator<T> it = dataList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            builder.f(key, f((String) pair.a(), pair.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.common.collect.y<String, String> d() {
        com.google.common.collect.y.a<String, String> aVarU = com.google.common.collect.y.u();
        p013kotlin.jvm.internal.s.h(aVarU);
        c(aVarU, "CMCD-Object", this.props.a());
        c(aVarU, "CMCD-Request", this.props.b());
        c(aVarU, "CMCD-Session", this.props.c());
        c(aVarU, "CMCD-Status", this.props.d());
        com.google.common.collect.y<String, String> yVarE = aVarU.e();
        p013kotlin.jvm.internal.s.j(yVarE, "build(...)");
        return yVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s8.e e(p7.y mediaItem) {
        return new s8.e(UUID.randomUUID().toString(), mediaItem.f101681a, new a(), g(this.props.getMode()));
    }

    private final String f(String key, Object value) {
        if (value instanceof String) {
            return key + "=\"" + value + "\"";
        }
        if (value instanceof Number) {
            return key + "=" + value;
        }
        throw new IllegalArgumentException("Unsupported value type: " + value.getClass());
    }

    private final int g(int mode) {
        if (mode == 0) {
            return 0;
        }
        if (mode == 1) {
            return 1;
        }
        xi.a.b("CMCDConfig", "Unsupported mode: " + mode + ", fallback on MODE_REQUEST_HEADER");
        return 0;
    }

    public final s8.e.a h() {
        return new s8.e.a() { // from class: com.brentvatne.exoplayer.b
            @Override // s8.e.a
            public final s8.e a(p7.y yVar) {
                return this.f20285a.e(yVar);
            }
        };
    }
}
