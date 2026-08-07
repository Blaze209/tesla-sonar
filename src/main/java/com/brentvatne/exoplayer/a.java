package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/brentvatne/exoplayer/a;", "", "", "outputName", "", "streamType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "I", "getStreamType", "()I", "Companion", "a", "SPEAKER", "EARPIECE", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"InlinedApi"})
public enum a {
    SPEAKER("speaker", 3),
    EARPIECE("earpiece", 0);

    private final String outputName;
    private final int streamType;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.brentvatne.exoplayer.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/brentvatne/exoplayer/a$a;", "", "<init>", "()V", "", "name", "Lcom/brentvatne/exoplayer/a;", "a", "(Ljava/lang/String;)Lcom/brentvatne/exoplayer/a;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            for (a aVar : a.values()) {
                if (p013kotlin.text.t.M(aVar.outputName, name, true)) {
                    return aVar;
                }
            }
            return a.SPEAKER;
        }

        private Companion() {
        }
    }

    a(String str, int i11) {
        this.outputName = str;
        this.streamType = i11;
    }

    public static final a get(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final int getStreamType() {
        return this.streamType;
    }

    @Override // java.lang.Enum
    public String toString() {
        return a.class.getSimpleName() + "(" + this.outputName + ", " + this.streamType + ")";
    }
}
