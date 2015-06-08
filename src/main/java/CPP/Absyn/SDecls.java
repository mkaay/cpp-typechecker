package CPP.Absyn; // Java Package generated by the BNF Converter.

public class SDecls extends Stm {
    public final Type type_;
    public final ListId listid_;

    public SDecls(Type p1, ListId p2) {
        type_ = p1;
        listid_ = p2;
    }

    public <R, A> R accept(CPP.Absyn.Stm.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof CPP.Absyn.SDecls) {
            CPP.Absyn.SDecls x = (CPP.Absyn.SDecls) o;
            return this.type_.equals(x.type_) && this.listid_.equals(x.listid_);
        }
        return false;
    }

    public int hashCode() {
        return 37 * (this.type_.hashCode()) + this.listid_.hashCode();
    }


}
