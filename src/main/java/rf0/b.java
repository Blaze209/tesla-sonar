package rf0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f108112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f108113d;

    static {
        int[] iArr = new int[a.c.values().length];
        f108110a = iArr;
        a.c cVar = a.c.STOPPED;
        iArr[cVar.ordinal()] = 1;
        int[] iArr2 = new int[a.c.values().length];
        f108111b = iArr2;
        a.c cVar2 = a.c.ACTIVATED;
        iArr2[cVar2.ordinal()] = 1;
        a.c cVar3 = a.c.STARTED;
        iArr2[cVar3.ordinal()] = 2;
        iArr2[cVar.ordinal()] = 3;
        int[] iArr3 = new int[a.c.values().length];
        f108112c = iArr3;
        iArr3[cVar3.ordinal()] = 1;
        iArr3[cVar2.ordinal()] = 2;
        iArr3[cVar.ordinal()] = 3;
        int[] iArr4 = new int[a.c.values().length];
        f108113d = iArr4;
        iArr4[cVar2.ordinal()] = 1;
        iArr4[cVar3.ordinal()] = 2;
        iArr4[cVar.ordinal()] = 3;
    }
}
