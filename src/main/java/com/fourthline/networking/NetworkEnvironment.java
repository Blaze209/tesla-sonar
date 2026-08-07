package com.fourthline.networking;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/networking/NetworkEnvironment;", "", "Production", "Sandbox", "Mock", "Lcom/fourthline/networking/NetworkEnvironment$Mock;", "Lcom/fourthline/networking/NetworkEnvironment$Production;", "Lcom/fourthline/networking/NetworkEnvironment$Sandbox;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NetworkEnvironment {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/fourthline/networking/NetworkEnvironment$Mock;", "Lcom/fourthline/networking/NetworkEnvironment;", "<init>", "()V", "STUB", "", "MOCK", "DEVELOPMENT", "TEST", "ACCEPTANCE", "actualEnvironment", "getActualEnvironment$fourthline_sdk_release", "()I", "equals", "", "other", "", "hashCode", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Mock implements NetworkEnvironment {
        public static final int $stable = 0;
        public static final int ACCEPTANCE = 4;
        public static final int DEVELOPMENT = 2;
        public static final Mock INSTANCE = new Mock();
        public static final int MOCK = 1;
        public static final int STUB = 0;
        public static final int TEST = 3;
        private static final int actualEnvironment = 0;

        private Mock() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Mock);
        }

        public final int getActualEnvironment$fourthline_sdk_release() {
            return actualEnvironment;
        }

        public int hashCode() {
            return -397754100;
        }

        public String toString() {
            return "Mock";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/networking/NetworkEnvironment$Production;", "Lcom/fourthline/networking/NetworkEnvironment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Production implements NetworkEnvironment {
        public static final int $stable = 0;
        public static final Production INSTANCE = new Production();

        private Production() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Production);
        }

        public int hashCode() {
            return -377663813;
        }

        public String toString() {
            return "Production";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/networking/NetworkEnvironment$Sandbox;", "Lcom/fourthline/networking/NetworkEnvironment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sandbox implements NetworkEnvironment {
        public static final int $stable = 0;
        public static final Sandbox INSTANCE = new Sandbox();

        private Sandbox() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Sandbox);
        }

        public int hashCode() {
            return 961671173;
        }

        public String toString() {
            return "Sandbox";
        }
    }
}
