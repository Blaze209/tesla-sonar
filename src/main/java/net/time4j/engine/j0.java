package net.time4j.engine;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface j0<U> {

    public static final class a<U> implements Serializable {
        private static final long serialVersionUID = 1564804888291509484L;
        private final long amount;
        private final U unit;

        private a(long j11, U u11) {
            if (u11 == null) {
                throw new NullPointerException("Missing chronological unit.");
            }
            if (j11 >= 0) {
                this.amount = j11;
                this.unit = u11;
            } else {
                throw new IllegalArgumentException("Temporal amount must be positive or zero: " + j11);
            }
        }

        public static <U> a<U> c(long j11, U u11) {
            return new a<>(j11, u11);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            if (this.unit == null || this.amount < 0) {
                throw new InvalidObjectException("Inconsistent state.");
            }
        }

        public long a() {
            return this.amount;
        }

        public U b() {
            return this.unit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) a.class.cast(obj);
                if (this.amount == aVar.amount && this.unit.equals(aVar.unit)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.unit.hashCode() * 29;
            long j11 = this.amount;
            return iHashCode + ((int) (j11 ^ (j11 >>> 32)));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(this.amount);
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(this.unit);
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }
    }

    List<a<U>> a();

    boolean isEmpty();

    boolean isNegative();
}
