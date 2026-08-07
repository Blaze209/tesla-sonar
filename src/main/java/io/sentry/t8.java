package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class t8<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<E> f81352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.sentry.util.a f81353b;

    t8(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f81352a = collection;
        this.f81353b = new io.sentry.util.a();
    }

    protected Collection<E> a() {
        return this.f81352a;
    }

    @Override // java.util.Collection
    public boolean add(E e11) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zAdd = a().add(e11);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zAdd;
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
    public boolean addAll(Collection<? extends E> collection) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zAddAll = a().addAll(collection);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zAddAll;
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
    public void clear() {
        d1 d1VarA = this.f81353b.a();
        try {
            a().clear();
            if (d1VarA != null) {
                d1VarA.close();
            }
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
    public boolean contains(Object obj) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zContains = a().contains(obj);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zContains;
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
    public boolean containsAll(Collection<?> collection) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zContainsAll = a().containsAll(collection);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zContainsAll;
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
    public boolean isEmpty() {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zIsEmpty = a().isEmpty();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zIsEmpty;
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zRemove = a().remove(obj);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zRemove;
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
    public boolean removeAll(Collection<?> collection) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zRemoveAll = a().removeAll(collection);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zRemoveAll;
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
    public boolean retainAll(Collection<?> collection) {
        d1 d1VarA = this.f81353b.a();
        try {
            boolean zRetainAll = a().retainAll(collection);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zRetainAll;
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
    public int size() {
        d1 d1VarA = this.f81353b.a();
        try {
            int size = a().size();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return size;
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

    public String toString() {
        d1 d1VarA = this.f81353b.a();
        try {
            String string = a().toString();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return string;
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
