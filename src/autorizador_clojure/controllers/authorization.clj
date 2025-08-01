(ns autorizador-clojure.controllers.authorization)

;; o controller deve: 
;; orquestrar o fluxo de autorizaçao (validaçoes) e processamento (subtraçao do valor do limite e adiçao do item no history) entre as lógicas do domínio
;; deve retornar os dados para o diplomat no formato do schema dos models