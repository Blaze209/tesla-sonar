package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
final class u8<E> extends t8<E> implements Queue<E> {
    private u8(Queue<E> queue) {
        super(queue);
    }

    static <E> u8<E> d(Queue<E> queue) {
        return new u8<>(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.t8
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Queue<E> a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public E element() {
        d1 d1VarA = this.f81353b.a();
        try {
            E eElement = a().element();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return eElement;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zEquals = a().equals(obj);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zEquals;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        d1 d1VarA = this.f81353b.a();
        try {
            int iHashCode = a().hashCode();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return iHashCode;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zOffer = a().offer(e11);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zOffer;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public E peek() {
        d1 d1VarA = this.f81353b.a();
        try {
            E ePeek = a().peek();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return ePeek;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public E poll() {
        d1 d1VarA = this.f81353b.a();
        try {
            E ePoll = a().poll();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return ePoll;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public E remove() {
        d1 d1VarA = this.f81353b.a();
        try {
            E eRemove = a().remove();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return eRemove;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        d1 d1VarA = this.f81353b.a();
        try {
            Object[] array = a().toArray();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return array;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        d1 d1VarA = this.f81353b.a();
        try {
            T[] tArr2 = (T[]) a().toArray(tArr);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return tArr2;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
