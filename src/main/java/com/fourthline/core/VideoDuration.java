package com.fourthline.core;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/VideoDuration;", "", "duration", "", "getDuration", "()J", "alias", "", "getAlias", "()Ljava/lang/String;", "DEFAULT", "EXTENDED", "CUSTOM", "Lcom/fourthline/core/VideoDuration$CUSTOM;", "Lcom/fourthline/core/VideoDuration$DEFAULT;", "Lcom/fourthline/core/VideoDuration$EXTENDED;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface VideoDuration {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/fourthline/core/VideoDuration$CUSTOM;", "Lcom/fourthline/core/VideoDuration;", "", "duration", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/fourthline/core/VideoDuration$CUSTOM;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getDuration", "b", "Ljava/lang/String;", "getAlias", "alias", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CUSTOM implements VideoDuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long duration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String alias = "custom";

        public CUSTOM(long j11) {
            this.duration = j11;
        }

        public static /* synthetic */ CUSTOM copy$default(CUSTOM custom, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = custom.duration;
            }
            return custom.copy(j11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final CUSTOM copy(long duration) {
            return new CUSTOM(duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CUSTOM) && this.duration == ((CUSTOM) other).duration;
        }

        @Override // com.fourthline.core.VideoDuration
        public String getAlias() {
            return this.alias;
        }

        @Override // com.fourthline.core.VideoDuration
        public long getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        public String toString() {
            return "CUSTOM(duration=" + this.duration + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/fourthline/core/VideoDuration$DEFAULT;", "Lcom/fourthline/core/VideoDuration;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "getDuration", "()J", "duration", "b", "Ljava/lang/String;", "getAlias", "alias", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DEFAULT implements VideoDuration {
        public static final DEFAULT INSTANCE = new DEFAULT();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private static final long duration = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String alias = "default";

        private DEFAULT() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DEFAULT);
        }

        @Override // com.fourthline.core.VideoDuration
        public String getAlias() {
            return alias;
        }

        @Override // com.fourthline.core.VideoDuration
        public long getDuration() {
            return duration;
        }

        public int hashCode() {
            return 1334357862;
        }

        public String toString() {
            return "DEFAULT";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/fourthline/core/VideoDuration$EXTENDED;", "Lcom/fourthline/core/VideoDuration;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "getDuration", "()J", "duration", "b", "Ljava/lang/String;", "getAlias", "alias", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EXTENDED implements VideoDuration {
        public static final EXTENDED INSTANCE = new EXTENDED();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private static final long duration = 60000;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String alias = "extended";

        private EXTENDED() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EXTENDED);
        }

        @Override // com.fourthline.core.VideoDuration
        public String getAlias() {
            return alias;
        }

        @Override // com.fourthline.core.VideoDuration
        public long getDuration() {
            return duration;
        }

        public int hashCode() {
            return 245217428;
        }

        public String toString() {
            return "EXTENDED";
        }
    }

    String getAlias();

    long getDuration();
}
