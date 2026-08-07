package p3;

import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lp3/j;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Lp3/h;", "Lkotlin/collections/ArrayList;", "nodes", "a", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float[] nodeData = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList b(j jVar, String str, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return jVar.a(str, arrayList);
    }

    public final ArrayList<h> a(String pathData, ArrayList<h> nodes) {
        int i11;
        char cCharAt;
        int i12;
        int length = pathData.length();
        int i13 = 0;
        while (i13 < length && s.m(pathData.charAt(i13), 32) <= 0) {
            i13++;
        }
        while (length > i13 && s.m(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i14 = 0;
        while (i13 < length) {
            while (true) {
                i11 = i13 + 1;
                cCharAt = pathData.charAt(i13);
                int i15 = cCharAt | ' ';
                if ((i15 - 97) * (i15 - 122) <= 0 && i15 != 101) {
                    break;
                }
                if (i11 >= length) {
                    cCharAt = 0;
                    break;
                }
                i13 = i11;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i14 = 0;
                    while (true) {
                        if (i11 >= length || s.m(pathData.charAt(i11), 32) > 0) {
                            long jA = b.a(pathData, i11, length);
                            i12 = (int) (jA >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i16 = i14 + 1;
                                fArr[i14] = fIntBitsToFloat;
                                if (i16 >= fArr.length) {
                                    float[] fArr2 = new float[i16 * 2];
                                    this.nodeData = fArr2;
                                    p013kotlin.collections.n.m(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i14 = i16;
                            }
                            while (i12 < length && pathData.charAt(i12) == ',') {
                                i12++;
                            }
                            if (i12 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            i11++;
                        }
                    }
                    i11 = i12;
                }
                i.a(cCharAt, nodes, this.nodeData, i14);
            }
            i13 = i11;
        }
        return nodes;
    }
}
