(ns autorizador-clojure.adapters.authorization-result)

;; essa camada deve fazer a traduçao/adaptaçao entre o formato dos dados do model e dos wire (in e out).
;; nesse projeto provavelmente o model e o wire terão o mesmo formato e não precisará modificar nada, 
;; porém vou implementar a camada apenas para exercitar a implementaçao da arquitetura

;; esse model e wire de result seria o schema de saída do domínio e da funçao do diplomat, 
;; portanto ele só existe na direçao model->wire-out (e chama o adapter de account na direçao model->wire-out)