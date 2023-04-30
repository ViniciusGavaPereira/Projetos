class MaquinaCafe extends MaquinaBebida {

    @Override
    public Bebida novaBebida() {
        // ...
        return new Cafe();
      }
    
}
