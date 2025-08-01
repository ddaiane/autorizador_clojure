(ns autorizador-clojure.adapters.transaction)

;; essa camada deve fazer a traduçao/adaptaçao entre o formato dos dados do model e dos wire (in e out).
;; nesse projeto provavelmente o model e o wire terão o mesmo formato e não precisará modificar nada, 
;; porém vou implementar a camada apenas para exercitar a implementaçao da arquitetura

;; deverá ter aqui os seguintes adapters:
;; - wire-in->model traduz os dados externos para o padrão do dominio
;; - model->wire-out traduz os dados do formato do domínio para o formato de saída