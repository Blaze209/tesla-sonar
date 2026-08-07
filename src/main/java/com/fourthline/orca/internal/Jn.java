package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerSecurityKey;

/* JADX INFO: loaded from: classes4.dex */
public interface Jn {

    public static final class a implements Jn {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26484b = NfcScannerSecurityKey.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NfcScannerSecurityKey f26485a;

        public a(NfcScannerSecurityKey key) {
            p013kotlin.jvm.internal.s.k(key, "key");
            this.f26485a = key;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26485a, ((a) obj).f26485a);
        }

        @Override // com.fourthline.orca.internal.Jn
        public NfcScannerSecurityKey getKey() {
            return this.f26485a;
        }

        public int hashCode() {
            return this.f26485a.hashCode();
        }

        public String toString() {
            return "Idl(key=" + this.f26485a + ")";
        }
    }

    public static final class b implements Jn {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26486b = NfcScannerSecurityKey.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NfcScannerSecurityKey f26487a;

        public b(NfcScannerSecurityKey key) {
            p013kotlin.jvm.internal.s.k(key, "key");
            this.f26487a = key;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f26487a, ((b) obj).f26487a);
        }

        @Override // com.fourthline.orca.internal.Jn
        public NfcScannerSecurityKey getKey() {
            return this.f26487a;
        }

        public int hashCode() {
            return this.f26487a.hashCode();
        }

        public String toString() {
            return "Mrtd(key=" + this.f26487a + ")";
        }
    }

    NfcScannerSecurityKey getKey();
}
