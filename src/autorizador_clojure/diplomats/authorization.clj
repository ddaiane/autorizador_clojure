(ns autorizador-clojure.diplomats.authorization)

;; aqui deve ter a comunicaçao com as camadas externas ao domínio e também com as partes externas ao sistema (como rotas http)
;; nesse caso não há uma rota http e sim apenas uma funçao, porém pretendo implementar a funçao aqui apenas para emular a arquitetura

;; essa camada deve:
;; - receber o contrato padrão da função (wire-in)
;; - acionar o adapter para traduzir para o schema dos models do domínio
;; - chamar o controller
;; - com o retorno do controller, acionar o adaptar para traduzir o formato do dominio para o formato de saída (wire out)
;; - retornar no formato de saída (wire out)