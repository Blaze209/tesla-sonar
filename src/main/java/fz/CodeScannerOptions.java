package fz;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import dz.x0;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fz.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfz/c;", "", "", "Lfz/d;", "codeTypes", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CodeScannerOptions {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<d> codeTypes;

    /* JADX INFO: renamed from: fz.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/c$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "value", "Lfz/c;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lfz/c;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CodeScannerOptions a(ReadableMap value) throws x0 {
            p013kotlin.jvm.internal.s.k(value, "value");
            ReadableArray array = value.getArray("codeTypes");
            if (array == null) {
                throw new x0("codeScanner", value.toString());
            }
            ArrayList<Object> arrayList = array.toArrayList();
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
            for (Object obj : arrayList) {
                d.Companion companion = d.INSTANCE;
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList2.add(companion.b((String) obj));
            }
            return new CodeScannerOptions(arrayList2);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodeScannerOptions(List<? extends d> codeTypes) {
        p013kotlin.jvm.internal.s.k(codeTypes, "codeTypes");
        this.codeTypes = codeTypes;
    }

    public final List<d> a() {
        return this.codeTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CodeScannerOptions) && p013kotlin.jvm.internal.s.f(this.codeTypes, ((CodeScannerOptions) other).codeTypes);
    }

    public int hashCode() {
        return this.codeTypes.hashCode();
    }

    public String toString() {
        return "CodeScannerOptions(codeTypes=" + this.codeTypes + ")";
    }
}
