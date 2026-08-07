package nq;

/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f95291a;

    b(Integer num) {
        this.f95291a = num;
    }

    @Override // nq.g
    public Integer a() {
        return this.f95291a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f95291a;
        Integer numA = ((g) obj).a();
        if (num == null) {
            return numA == null;
        }
        return num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f95291a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f95291a + "}";
    }
}
