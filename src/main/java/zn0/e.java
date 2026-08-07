package zn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, d2 = {"Lzn0/e;", "Lzn0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "c", "()I", "bitCount", "b", "(I)I", "I", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends c implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f128449i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int z;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int w;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int v;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int addend;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzn0/e$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.x = i11;
        this.y = i12;
        this.z = i13;
        this.w = i14;
        this.v = i15;
        this.addend = i16;
        if ((i11 | i12 | i13 | i14 | i15) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i17 = 0; i17 < 64; i17++) {
            c();
        }
    }

    @Override // zn0.c
    public int b(int bitCount) {
        return d.f(c(), bitCount);
    }

    @Override // zn0.c
    public int c() {
        int i11 = this.x;
        int i12 = i11 ^ (i11 >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i13 = this.v;
        this.w = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.v = i14;
        int i15 = this.addend + 362437;
        this.addend = i15;
        return i14 + i15;
    }

    public e(int i11, int i12) {
        this(i11, i12, 0, 0, ~i11, (i11 << 10) ^ (i12 >>> 4));
    }
}
