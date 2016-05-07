/**
 * Created by Hassan on 07/05/2016.
 */

function test(nom,n) {
    var rep=true;
    for (i=0; i<n; i++) {
        if (nom[i].value==1 && nom[i].checked==false) rep=false;
        if (nom[i].value==0 && nom[i].checked==true) rep=false;
    }
    return rep;
}

function validateqcm() {
    if (test(choix,4)) {
        alert('bonne réponse.')
    }
    else {alert('réponse fausse.')};

}